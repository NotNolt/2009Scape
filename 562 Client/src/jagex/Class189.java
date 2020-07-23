package jagex;/* jagex.Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class189
{
    public static int anInt2759;
    public int anInt2760;
    public static String MembersObjectString;
    public boolean aBoolean2762;
    public static Class1_Sub7_Sub1_Sub1[] aClass1_Sub7_Sub1_Sub1Array2763;
    public static int[] anIntArray2764 = new int[5];
    public int anInt2765;
    public int anInt2766 = 0;
    public static int anInt2767;
    public static int anInt2768;
    public static int anInt2769;
    public int anInt2770;
    public static int anInt2771;
    public static int anInt2772;
    public int anInt2773;
    public boolean aBoolean2774;
    public boolean aBoolean2775;
    public int anInt2776;
    public int anInt2777;
    public int anInt2778;
    
    public static void method2600(int arg0, int arg1) {
	try {
	    anInt2772++;
	    Class131_Sub41_Sub6 class131_sub41_sub6
		= Class131_Sub13.method1709(1, arg1, (byte) 1);
	    int i = 101 % ((10 - arg0) / 62);
	    class131_sub41_sub6.method1959(-92);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tc.D(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public void method2601(int arg0, boolean arg1) {
	if (anInt2765 == -1)
	    anInt2765 = anInt2760;
	anInt2767++;
	anInt2778 = anInt2778 << -1687695224 | arg0;
	if (arg1 != false)
	    method2603(null, 114, 18);
    }
    
    public static void method2602(int arg0) {
	try {
	    anIntArray2764 = null;
	    if (arg0 != -9)
		aClass1_Sub7_Sub1_Sub1Array2763 = null;
	    MembersObjectString = null;
	    aClass1_Sub7_Sub1_Sub1Array2763 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tc.E(" + arg0 + ')');
	}
    }
    
    public void method2603(Stream arg0, int arg1, int arg2) {
	try {
	    anInt2769++;
	    if (arg2 != -5780)
		method2603(null, 92, 95);
	    for (;;) {
		int i = arg0.readUnsignedByte(-58);
		if (i == 0)
		    break;
		method2605(arg0, arg1, -121, i);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tc.C("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public static void method2604(int arg0) {
	try {
	    Class131_Sub2_Sub15.MoreOptionsString = " weitere Optionen";
	    Class131_Sub41_Sub21_Sub2.ChooseOptionString = "W\u00e4hl eine Option";
	    Class12.SelectString = "Ausw\u00e4hlen";
	    Class180.AttackString = "Angreifen";
	    Class121_Sub3_Sub1.CoinKString = "T";
	    Class131_Sub41_Sub11.CreatedGameWorldString = "Spielwelt erstellt.";
	    Class131_Sub2_Sub19.CyanColoredText = "blaugr\u00fcn:";
	    Class121_Sub2.AlreadyOnFriendsListString = " steht bereits auf deiner Freunde-Liste!";
	    Class145.AttemptingToReestablishString = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
	    Class14.Glow3ColorText = "leuchten3:";
	    Class131_Sub8_Sub1.PleaseWaitString = "Bitte warte...";
	    Class131_Sub10.LoadedWordPackString = "Wordpack geladen.";
	    Class133.LoadingDefaultsString = "Lade Standardeinstellungen - ";
	    Class131_Sub18.FullFriendsListString = "Deine Freunde-Liste ist voll! Maximale Eintr\u00e4ge: Mitglieder 200/freie Spieler 100";
	    Class218.ViloletColoredText = "lila:";
	    Class28.AllocatingMemoryString = "Speicher wird zugewiesen.";
	    Class172.LoadedClientVariableString = "jagex.Client-Variablen geladen";
	    Class131_Sub11.RemoveFromIgnoreListString = " zuerst von deiner Ignorieren-Liste!";
	    Class220.ConnectionLostString = "Verbindung abgebrochen.";
	    Class23_Sub2_Sub2.Drop = "Fallen lassen";
	    Class94.Flash3ColorText = "blinken3:";
	    Class131_Sub2.HasLoggedOutString = " loggt sich aus.";
	    Class110.ScrollText = "scrollen:";
	    Class101.Wave2Text = "welle2:";
	    Class121_Sub2.LoadingFontsString = "Lade Schrifts\u00e4tze - ";
	    Class131_Sub41_Sub13.LoadingSpritesString = "Lade Sprites - ";
	    Class131_Sub2_Sub5.SkillString = "Fertigkeit: ";
	    Class199.Library3DString = "Starte 3D-Softwarebibliothek.";
	    Class22.RedColorText = "rot:";
	    if (arg0 < -83) {
		Class59.LoadedDefaultsString = "Standardeinstellungen geladen";
		NPCDefinition.WhiteColorText = "weiss:";
		Class17.OkayString = "Okay";
		Class19.StellarDawnLoadingString = "Mechscape wird geladen - bitte warten...";
		Class131_Sub19.ExamineString = "Untersuchen";
		Class131_Sub37.LoadingInterfacesString = "Lade Benutzeroberfl\u00e4che - ";
		Class131_Sub10.Flash2Text = "blinken2:";
		Class23_Sub1_Sub2.LoadedTitleScreenString = "Titelbild geladen.";
		Class110_Sub1.HasLoggedInString = " loggt sich ein.";
		Class53.AddYourselfToFriendsString = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
		Class131_Sub18.AlreadyOnIgnoreListString = " steht bereits auf deiner Ignorieren-Liste!";
		Class131_Sub2_Sub9.PreparedSoundEngineString = "Musik-Engine vorbereitet.";
		Class155.SlideText = "gleiten:";
		Class184.RsLoadingPleaseWaitString = "RuneScape wird geladen - bitte warten...";
		Class153.LoadingWordpackString = "Lade Wordpack - ";
		Class131_Sub2_Sub12.PleaseRemoveString = "Bitte entferne ";
		Class182.CancelString = "Abbrechen";
		Class44.Flash1ColorText = "blinken1:";
		Class192.ConnectUpdateServerString = "Verbindung mit Update-Server...";
		MembersObjectString = "Gegenstand f\u00fcr Mitglieder";
		Class184.OpenedTitleScreenString = "Titelbild ge\u00f6ffnet.";
		Class121.AllocatedMemoryString = "Zugewiesener Speicher.";
		Class131_Sub2_Sub11.CoinsMString = "M";
		Class156.ShakeText = "sch\u00fctteln:";
		Class120.IgnoreListFullString
		    = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
		Class126.CloseString = "Schlie\u00dfen";
		Class5.LoadingConfigString = "Lade Konfiguration - ";
		Class131_Sub2_Sub4.LoadedInterfacesString
		    = "Benutzeroberfl\u00e4che geladen.";
		Class131_Sub2_Sub30.DiscardString = "Ablegen";
		Class131_Sub8.PleaseRemoveString = "Bitte entferne ";
		Class34.LoadedConfigString = "Konfig geladen.";
		Class131_Sub41_Sub1.AddSelfToIgnoreListString
		    = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
		Class131_Sub41_Sub2.ConnectedUpdateServerString
		    = "Verbindung zum Update-Server hergestellt.";
		Class14.LoadingPleaseWaitString = "Ladevorgang - bitte warte.";
		Class131_Sub2_Sub9.UnableToFindString
		    = "Spieler kann nicht gefunden werden: ";
		Class19.LoadedUpdateListString = "Update-Liste geladen.";
		Class131_Sub2_Sub31.LoadedSpritesString = "Sprites geladen.";
		Class100.Started3dLibraryString = "3D-Softwarebibliothek gestartet.";
		Class131_Sub2_Sub14.LoadingTitleScreenString = "Lade Titelbild - ";
		FileSystem.UseOptionString = "Benutzen";
		Class23.YellowColorText = "gelb:";
		Class165.HiddenString = "Versteckt";
		Class131_Sub3.LoadingString = "Lade...";
		Class203.LiterallyJustAColonString = ": ";
		Class46.RatingString = "Kampfstufe: ";
		Class131_Sub2_Sub10.LoadedTexturesString = "Texturen geladen.";
		Class176.GreenColorText = "gr\u00fcn:";
		Class171.WaveText = "welle:";
		Class131_Sub41_Sub5.Glow2ColorText = "leuchten2:";
		Class131_Sub2_Sub11.CoinsBigMString = "M";
		Class1_Sub2.LevelString = "Stufe: ";
		Class131_Sub2_Sub30.LoadingTexturesString = "Lade Texturen - ";
		anInt2771++;
		Class88.CoinsBigKString = "T";
		Class52.FriendsToIgnoreString = " zuerst von deiner Freunde-Liste!";
		Class131_Sub2_Sub13.Glow1ColorText = "leuchten1:";
		Class21.LoadWorldListDataString = "Lade Liste der Welten";
		Class131_Sub41_Sub11_Sub1.WalkHereString = "Hierhin gehen";
		Class33.Take = "Nehmen";
		Class127_Sub1.ContinueString = "Weiter";
		Class144.FaceHereString = "Hierhin drehen";
		Class131_Sub41_Sub6.LoadedFontsString = "Schrifts\u00e4tze geladen.";
		Class131_Sub18.LoadedInputHandlerString = "Eingabeprozedur geladen.";
		Class131_Sub6.LoadedWorldListDataString = "Liste der Welten geladen";
		Class126.CheckingForUpdatesString = "Suche nach Updates - ";
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"tc.B(" + arg0 + ')');
	}
    }
    
    public void method2605(Stream arg0, int arg1, int arg2, int arg3) {
	try {
	    if (arg2 < -113) {
		if (arg3 != 1) {
		    if (arg3 == 2)
			anInt2760 = arg0.readUnsignedByte(-60);
		    else if (arg3 == 3) {
			anInt2760 = arg0.readUnsignedShort(8104);
			if (anInt2760 == 65535)
			    anInt2760 = -1;
		    } else if (arg3 != 5) {
			if (arg3 == 7)
			    anInt2776
				= Class81.method788(arg0.read3Bytes(false),
						    (byte) 106);
			else if (arg3 != 8) {
			    if (arg3 != 9) {
				if (arg3 == 10)
				    aBoolean2774 = false;
				else if (arg3 != 11) {
				    if (arg3 == 12)
					aBoolean2775 = true;
				    else if (arg3 != 13) {
					if (arg3 != 14) {
					    if (arg3 == 15) {
						anInt2765
						    = arg0.readUnsignedShort(8104);
						if (anInt2765 == 65535)
						    anInt2765 = -1;
					    }
					} else
					    anInt2770 = arg0.readUnsignedByte(-71);
				    } else
					anInt2777 = arg0.read3Bytes(false);
				} else
				    anInt2778 = arg0.readUnsignedByte(-88);
			    } else
				anInt2773 = arg0.readUnsignedShort(8104);
			} else
			    Class105.anInt1371 = arg1;
		    } else
			aBoolean2762 = false;
		} else
		    anInt2766 = Class81.method788(arg0.read3Bytes(false),
						  (byte) 106);
		anInt2759++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("tc.A("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ',' + arg3 + ')'));
	}
    }
    
    public Class189() {
	anInt2765 = -1;
	aBoolean2762 = true;
	anInt2773 = 128;
	aBoolean2774 = true;
	anInt2770 = 16;
	anInt2777 = 1190717;
	anInt2760 = -1;
	aBoolean2775 = false;
	anInt2776 = -1;
	anInt2778 = 8;
    }
    
    static {
	MembersObjectString = "Members object";
	anInt2768 = -1;
    }
}
