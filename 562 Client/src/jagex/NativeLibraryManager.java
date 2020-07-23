package jagex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * A manager for writing the appropriate native libraries needed by the client
 * to load the HD graphics rendering.
 * 
 * @author Jagex
 * @author Cedia for converting
 */
public final class NativeLibraryManager {
	// Index 29 is the library index (custom)

	public static FileSystem nativeLibrarySystem;

	private static String osAndArchPath;

	public static final boolean writeNativeLibrary(String arch) {
		String extension = getLibExtension(arch);

		if (extension == null)
			return false;

		String fullPath = osAndArchPath + extension;

		if (!nativeLibrarySystem.method2363(-1, "", fullPath)) {// file loaded
			return false;
		}
		if (!nativeLibrarySystem.method2371(-1, fullPath)) {// if archive exists
			return nativeLibrarySystem.getContainerId(150, fullPath) == -1 ? false
					: true;
		}

		byte[] cachedLibraryData = nativeLibrarySystem.getContainerData(
				fullPath, "", (byte) 1);

		File library = SignLink.getFileInCacheDir(extension);
		if (cachedLibraryData != null && library != null) {
			boolean libraryIsValid = true;
			byte[] libraryFileData = getDataFromFile(library);
			/* Verifies the library file(if it exists) with the one in the cache */
			if (libraryFileData != null
					&& libraryFileData.length == cachedLibraryData.length) {
				for (int index = 0; libraryFileData.length > index; index++) {
					if (cachedLibraryData[index] != libraryFileData[index]) {
						libraryIsValid = false;
						break;
					}
				}
			} else {
				libraryIsValid = false;
			}
			if (!libraryIsValid) {
				try {
					// writes the native libraries
					FileOutputStream out = new FileOutputStream(library);
					out.write(cachedLibraryData, 0, cachedLibraryData.length);
					out.close();
				} catch (Throwable e) {
					return false;
				}
			}
			return true;
		}

		return false;
	}

	public static final void setOSAndArchPath() {
		String string = "";
		if (SignLink.osName.startsWith("win")
				|| SignLink.osName.startsWith("windows 7"))
			string = new StringBuilder().append(string).append("windows/")
					.toString();
		else if (SignLink.osName.startsWith("linux"))
			string = new StringBuilder().append(string).append("linux/")
					.toString();
		else if (SignLink.osName.startsWith("mac"))
			string = new StringBuilder().append(string).append("macos/")
					.toString();
		if (SignLink.osArch.startsWith("amd64")
				|| SignLink.osArch.startsWith("x86_64"))
			string = new StringBuilder().append(string).append("x86_64/")
					.toString();
		else if (SignLink.osArch.startsWith("i386")
				|| SignLink.osArch.startsWith("i486")
				|| SignLink.osArch.startsWith("i586")
				|| SignLink.osArch.startsWith("x86"))
			string = new StringBuilder().append(string).append("x86/")
					.toString();
		else if (SignLink.osArch.startsWith("ppc"))
			string = new StringBuilder().append(string).append("ppc/")
					.toString();
		else
			string = new StringBuilder().append(string).append("universal/")
					.toString();
		osAndArchPath = string;
	}

	private static final String getLibExtension(String string) {
		try {
			if (SignLink.osName.startsWith("win"))
				return new StringBuilder().append(string).append(".dll")
						.toString();
			if (SignLink.osName.startsWith("linux"))
				return new StringBuilder().append("lib").append(string)
						.append(".so").toString();
			if (SignLink.osName.startsWith("mac"))
				return new StringBuilder().append("lib").append(string)
						.append(".jnilib").toString();
			return null;
		} catch (RuntimeException runtimeexception) {
			throw new RuntimeException();
		}
	}

	public static final byte[] getDataFromFile(File file) {
		return getDataFromFile(file, (int) file.length());
	}

	private static final byte[] getDataFromFile(File file, int length) {
		try {
			byte[] data = new byte[length];
			readFile(data, length, file);
			return data;
		} catch (IOException ioexception) {
			return null;
		}
	}

	private static final void readFile(byte[] data, int length, File file)
			throws IOException {
		DataInputStream datainputstream = (new DataInputStream(
				new BufferedInputStream(new FileInputStream(file))));
		try {
			datainputstream.readFully(data, 0, length);
		} catch (EOFException eofexception) {
		}
		datainputstream.close();
	}

}
