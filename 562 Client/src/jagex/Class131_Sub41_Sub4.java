package jagex;/* jagex.Class131_Sub41_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131_Sub41_Sub4 extends Class131_Sub41
{
    public char[] aCharArray6195;
    public static int anInt6196;
    public static int anInt6197;
    public String aString6198;
    public static int anInt6199;
    public static int[][][] anIntArrayArrayArray6200 = new int[2][][];
    public static int anInt6201;
    public static int anInt6202;
    public static int anInt6203;
    public static int anInt6204 = 0;
    public char[] aCharArray6205;
    public static String[] aStringArray6206 = new String[100];
    public static int anInt6207;
    public static int anInt6208;
    public int[] anIntArray6209;
    public int[] anIntArray6210;
    public static int anInt6211;
    public static volatile int anInt6212 = 0;
    public static int anInt6213;
    public static int anInt6214;
    public static int anInt6215;
    public static int anInt6216;
    public static int anInt6217;
    /*synthetic*/ public static Class aClass6218;
    
    public static String method1936(boolean arg0, long arg1, int[] arg2,
				    int arg3) {
	try {
	    anInt6197++;
	    if (arg0 != true)
		method1947((byte) -103);
	    if (Class192.anInterface3_2821 != null) {
		String string = Class192.anInterface3_2821.method9(arg2, arg3,
								   -74, arg1);
		if (string != null)
		    return string;
	    }
	    return Long.toString(arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fq.L(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ',' + arg3 + ')'));
	}
    }
    
    public static void method1937(int arg0) {
	try {
	    Class131_Sub2_Sub12.PleaseRemoveString
		= "Veuillez commencer par supprimer ";
	    Class21.LoadWorldListDataString = "Chargement de la liste des serveurs";
	    Class153.LoadingWordpackString = "Chargement du module texte - ";
	    Class59.LoadedDefaultsString
		= "Param\u00e8tres par d\u00e9faut charg\u00e9s";
	    Class22.RedColorText = "rouge:";
	    Class121_Sub2.LoadingFontsString = "Chargement des polices - ";
	    Class131_Sub2_Sub15.MoreOptionsString = " autres options";
	    Class33.Take = "Prendre";
	    Class131_Sub2_Sub10.LoadedTexturesString = "Textures charg\u00e9es";
	    Class131_Sub3.LoadingString = "Chargement en cours...";
	    Class131_Sub2_Sub31.LoadedSpritesString = "Sprites charg\u00e9s";
	    Class131_Sub2_Sub14.LoadingTitleScreenString
		= "Chargement de l'\u00e9cran-titre - ";
	    Class5.LoadingConfigString = "Chargement des fichiers config - ";
	    Class131_Sub41_Sub6.LoadedFontsString = "Polices charg\u00e9es";
	    Class184.RsLoadingPleaseWaitString
		= "Chargement de RuneScape en cours - veuillez patienter...";
	    Class53.AddYourselfToFriendsString
		= "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste d'amis.";
	    Class52.FriendsToIgnoreString = " de votre liste d'amis.";
	    Class23_Sub2_Sub2.Drop = "Poser";
	    Class131_Sub10.LoadedWordPackString = "Module texte charg\u00e9";
	    Class94.Flash3ColorText = "clignotant3:";
	    Class100.Started3dLibraryString = "Librairie 3D d\u00e9marr\u00e9e";
	    Class23.YellowColorText = "jaune:";
	    Class131_Sub2_Sub4.LoadedInterfacesString = "Interfaces charg\u00e9es";
	    Class144.FaceHereString = "Regarder dans cette direction";
	    Class126.CloseString = "Fermer";
	    anInt6208++;
	    Class165.HiddenString = "Cach\u00e9";
	    Class120.IgnoreListFullString
		= "Votre liste noire est pleine (100 noms maximum).";
	    Class131_Sub8.PleaseRemoveString = "Veuillez commencer par supprimer ";
	    Class131_Sub2_Sub19.CyanColoredText = "cyan:";
	    Class131_Sub41_Sub1.AddSelfToIgnoreListString
		= "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste noire.";
	    Class131_Sub8_Sub1.PleaseWaitString = "Veuillez patienter...";
	    Class14.Glow3ColorText = "brillant3:";
	    Class131_Sub19.ExamineString = "Examiner";
	    Class121_Sub3_Sub1.CoinKString = "K";
	    Class131_Sub18.LoadedInputHandlerString = "Gestionnaire de saisie charg\u00e9";
	    Class34.LoadedConfigString = "Fichiers config charg\u00e9s";
	    Class131_Sub41_Sub2.ConnectedUpdateServerString
		= "Connect\u00e9 au serveur de mise \u00e0 jour";
	    Class131_Sub37.LoadingInterfacesString = "Chargement des interfaces - ";
	    Class19.LoadedUpdateListString = "Liste des mises \u00e0 jour charg\u00e9e";
	    Class110_Sub1.HasLoggedInString = " s'est connect\u00e9.";
	    FileSystem.UseOptionString = "Utiliser";
	    if (arg0 != -1)
		anInt6199 = 31;
	    Class172.LoadedClientVariableString = "Variables du client charg\u00e9es";
	    Class184.OpenedTitleScreenString = "\u00c9cran-titre ouvert";
	    Class182.CancelString = "Annuler";
	    Class14.LoadingPleaseWaitString = "Chargement en cours. Veuillez patienter.";
	    Class46.RatingString = "classement ";
	    Class171.WaveText = "ondulation:";
	    Class203.LiterallyJustAColonString = " ";
	    NPCDefinition.WhiteColorText = "blanc:";
	    Class23_Sub1_Sub2.LoadedTitleScreenString = "\u00c9cran-titre charg\u00e9";
	    Class12.SelectString = "S\u00e9lectionner";
	    Class121_Sub2.AlreadyOnFriendsListString
		= " est d\u00e9j\u00e0 dans votre liste d'amis.";
	    Class131_Sub2_Sub30.DiscardString = "Jeter";
	    Class189.MembersObjectString = "Objet d'abonn\u00e9s";
	    Class131_Sub2_Sub30.LoadingTexturesString = "Chargement des textures - ";
	    Class131_Sub2.HasLoggedOutString = " s'est d\u00e9connect\u00e9.";
	    Class131_Sub41_Sub13.LoadingSpritesString = "Chargement des sprites - ";
	    Class131_Sub2_Sub11.CoinsMString = "M";
	    Class199.Library3DString = "D\u00e9marrage de la librairie 3D";
	    Class88.CoinsBigKString = "K";
	    Class44.Flash1ColorText = "clignotant1:";
	    Class133.LoadingDefaultsString
		= "Chargement des param\u00e8tres par d\u00e9faut - ";
	    Class131_Sub2_Sub11.CoinsBigMString = "M";
	    Class145.AttemptingToReestablishString
		= "Veuillez patienter - tentative de r\u00e9tablissement.";
	    Class131_Sub2_Sub13.Glow1ColorText = "brillant1:";
	    Class127_Sub1.ContinueString = "Continuer";
	    Class131_Sub2_Sub9.UnableToFindString = "Impossible de trouver ";
	    Class131_Sub2_Sub9.PreparedSoundEngineString = "Moteur son pr\u00e9par\u00e9";
	    Class156.ShakeText = "tremblement:";
	    Class19.StellarDawnLoadingString
		= "Chargement de Mechscape en cours - veuillez patienter...";
	    Class17.OkayString = "OK";
	    Class192.ConnectUpdateServerString
		= "Connexion au serveur de mise \u00e0 jour en cours";
	    Class131_Sub11.RemoveFromIgnoreListString = " de votre liste noire.";
	    Class131_Sub41_Sub21_Sub2.ChooseOptionString = "Choisir une option";
	    Class1_Sub2.LevelString = "niveau ";
	    Class180.AttackString = "Attaquer";
	    Class121.AllocatedMemoryString = "M\u00e9moire attribu\u00e9e";
	    Class176.GreenColorText = "vert:";
	    Class220.ConnectionLostString = "Connexion perdue.";
	    Class131_Sub10.Flash2Text = "clignotant2:";
	    Class131_Sub41_Sub11.CreatedGameWorldString = "Monde de jeu cr\u00e9\u00e9";
	    Class131_Sub6.LoadedWorldListDataString = "Liste des serveurs charg\u00e9e";
	    Class101.Wave2Text = "ondulation2:";
	    Class131_Sub41_Sub5.Glow2ColorText = "brillant2:";
	    Class218.ViloletColoredText = "violet:";
	    Class131_Sub41_Sub11_Sub1.WalkHereString = "Atteindre";
	    Class28.AllocatingMemoryString = "M\u00e9moire en cours d'attribution";
	    Class131_Sub18.AlreadyOnIgnoreListString
		= " est d\u00e9j\u00e0 dans votre liste noire.";
	    Class126.CheckingForUpdatesString
		= "V\u00e9rification des mises \u00e0 jour - ";
	    Class155.SlideText = "glissement:";
	    Class131_Sub2_Sub5.SkillString = "comp\u00e9tence ";
	    Class131_Sub18.FullFriendsListString
		= "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonn\u00e9s).";
	    Class110.ScrollText = "d\u00e9roulement:";
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"fq.C(" + arg0 + ')');
	}
    }
    
    public static void method1938(Class173[] arg0, boolean arg1, int arg2) {
	try {
	    if (arg1 != true)
		anInt6212 = 61;
	    for (int i = 0; i < arg0.length; i++) {
		Class173 class173 = arg0[i];
		if (class173 != null) {
		    if (class173.anInt2470 == 0) {
			if (class173.aClass173Array2326 != null)
			    method1938(class173.aClass173Array2326, true,
				       arg2);
			Class131_Sub33 class131_sub33
			    = ((Class131_Sub33)
			       (Class83.aClass180_1096.method2521
				(118, (long) class173.anInt2455)));
			if (class131_sub33 != null)
			    Class9.method185(class131_sub33.anInt4556, 4095,
					     arg2);
		    }
		    if (arg2 == 0
			&& class173.anObjectArray2475 != null) {
			Class131_Sub14 class131_sub14 = new Class131_Sub14();
			class131_sub14.aClass173_4276 = class173;
			class131_sub14.anObjectArray4281
			    = class173.anObjectArray2475;
			ClientScriptDefinition.method2437(class131_sub14);
		    }
		    if (arg2 == 1 && class173.anObjectArray2352 != null) {
			if (class173.anInt2350 >= 0) {
			    Class173 class173_0_
				= Class190.method2615(class173.anInt2455, -15);
			    if (class173_0_ == null
				|| class173_0_.aClass173Array2326 == null
				|| (class173.anInt2350 >= class173_0_.aClass173Array2326.length)
				|| class173 != (class173_0_.aClass173Array2326
						[class173.anInt2350]))
				continue;
			}
			Class131_Sub14 class131_sub14 = new Class131_Sub14();
			class131_sub14.aClass173_4276 = class173;
			class131_sub14.anObjectArray4281
			    = class173.anObjectArray2352;
			ClientScriptDefinition.method2437(class131_sub14);
		    }
		}
	    }
	    anInt6203++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fq.D("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ',' + arg2
						 + ')'));
	}
    }
    
    public void method1939(Stream arg0, int arg1) {
	anInt6196++;
	for (;;) {
	    int i = arg0.readUnsignedByte(-26);
	    if (i == 0)
		break;
	    method1940((byte) 62, i, arg0);
	}
	if (arg1 > -15)
	    method1942(-72, null, 75, null, -63, false, 70, 113, 7, null, 93,
		       true);
    }
    
    public void method1940(byte arg0, int arg1, Stream arg2) {
	try {
	    if (arg0 <= 46)
		anIntArrayArrayArray6200 = null;
	    if (arg1 == 1)
		aString6198 = arg2.readString(false);
	    else if (arg1 == 2) {
		int i = arg2.readUnsignedByte(-120);
		aCharArray6205 = new char[i];
		anIntArray6209 = new int[i];
		for (int i_1_ = 0; i > i_1_;
             i_1_++) {
		    anIntArray6209[i_1_] = arg2.readUnsignedShort(8104);
		    byte i_2_ = arg2.readSignedByte((byte) 127);
		    aCharArray6205[i_1_]
			= (i_2_ != 0
			   ? Class214.method2782(49, i_2_) : '\0');
		}
	    } else if (arg1 == 3) {
		int i = arg2.readUnsignedByte(-116);
		anIntArray6210 = new int[i];
		aCharArray6195 = new char[i];
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
		    anIntArray6210[i_3_] = arg2.readUnsignedShort(8104);
		    byte i_4_ = arg2.readSignedByte((byte) 127);
		    aCharArray6195[i_3_] = (i_4_ == 0 ? '\0'
					    : Class214.method2782(66, i_4_));
		}
	    }
	    anInt6217++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fq.J(" + arg0 + ',' + arg1
						 + ','
						 + (arg2 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    public static void method1941(GraphicsToolkit arg0, int arg1) {
	try {
	    arg0.method1188(0, 0, Class131_Sub1_Sub1.anInt5499, 350);
	    anInt6216++;
	    if (arg1 == -19812) {
		arg0.method1173(0, 0, Class131_Sub1_Sub1.anInt5499, 350,
				Class84.anInt1101 << -2092189384 | 0x332277,
				1);
		for (int i = 0; i < 100; i++) {
		    int i_5_ = Class131_Sub30.anIntArray4517[i];
		    int i_6_ = Class23_Sub2_Sub2.anIntArray5167[i];
		    arg0.method1173(i_5_, i_6_, 2, 2,
				    (0xffffff
				     | (Class131_Sub2_Sub1.anIntArray5571[i]
					<< -2031536040)),
				    1);
		}
		int i = 350 / InputStream_Sub1.anInt61;
		if (Class110.anInt1431 > 0) {
		    int i_7_ = -InputStream_Sub1.anInt61 + 346 - 4;
		    int i_8_ = i * i_7_ / (-1 + (i - -Class110.anInt1431));
		    int i_9_ = 4;
		    if (Class110.anInt1431 > 1)
			i_9_ += ((i_7_ + -i_8_)
				 * (-1 + (Class110.anInt1431
					  + -Class157.anInt2077))
				 / (Class110.anInt1431 + -1));
		    arg0.method1173(-16 + Class131_Sub1_Sub1.anInt5499, i_9_,
				    12, i_8_,
				    Class84.anInt1101 << 1595309304 | 0x332277,
				    2);
		    for (int i_10_ = Class157.anInt2077;
			 (Class157.anInt2077 + i > i_10_
			  && Class110.anInt1431 > i_10_);
			 i_10_++) {
			String[] strings
			    = (Class131_Sub41_Sub21.method2077
			       ((byte) 120,
				Class131_Sub41_Sub7.aStringArray6253[i_10_],
				'\010'));
			int i_11_ = ((-16 + (Class131_Sub1_Sub1.anInt5499 - 8))
				     / strings.length);
			for (int i_12_ = 0;
			     (i_12_ < strings.length);
			     i_12_++) {
			    int i_13_ = 8 + i_11_ * i_12_;
			    arg0.method1188(i_13_, 0, -8 + (i_13_ - -i_11_),
					    350);
			    Class184.aClass44_2633.method529
				(-8219, strings[i_12_], -1,
				 -2 + (350 - Class131_Sub24.anInt4471
				       + -Class131_Sub24.aClass55_4469.anInt717
				       + -((-Class157.anInt2077 + i_10_)
					   * InputStream_Sub1.anInt61)),
				 i_13_, -16777216);
			}
		    }
		}
		arg0.method1188(0, 0, Class131_Sub1_Sub1.anInt5499, 350);
		arg0.method1225(0, -1, (byte) -100,
				Class131_Sub1_Sub1.anInt5499,
				350 - Class131_Sub24.anInt4471);
		Class93.aClass44_1222.method529
		    (arg1 ^ 0x6d79, "--> " + Class23_Sub1_Sub1.aString5085, -1,
		     350 + (-Class89.aClass55_3259.anInt717 - 1), 10,
		     -16777216);
		int i_14_ = -1;
		if (Class125.anInt1632 % 30 > 15)
		    i_14_ = 16777215;
		arg0.method1253
		    (true, -11 + -Class89.aClass55_3259.anInt717 + 350, i_14_,
		     ((Class89.aClass55_3259.method621
		       ((byte) 116,
			"--> " + Class23_Sub1_Sub1.aString5085
				     .substring(0, Class128_Sub1.anInt4014)))
		      + 10),
		     12);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fq.G("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static void method1942(int arg0, GraphicsToolkit arg1, int arg2,
				  Class19[] arg3, int arg4, boolean arg5,
				  int arg6, int arg7, int arg8, byte[] arg9,
				  int arg10, boolean arg11) {
	do {
	    try {
		anInt6202++;
		Stream stream = new Stream(arg9);
		int i = -1;
		for (;;) {
		    int i_15_ = stream.method1758(32767);
		    if (i_15_ == 0)
			break;
		    i += i_15_;
		    int i_16_ = 0;
		    for (;;) {
			int i_17_ = stream.readSmart(-1647926640);
			if (i_17_ == 0)
			    break;
			i_16_ += i_17_ + -1;
			int i_18_ = i_16_ & 0x3f;
			int i_19_ = (0xfe5 & i_16_) >> -1821055898;
			int i_20_ = i_16_ >> -268354868;
			int i_21_ = stream.readUnsignedByte(-14);
			int i_22_ = i_21_ >> 1669226082;
			int i_23_ = 0x3 & i_21_;
			if (arg7 == i_20_
			    && arg8 <= i_19_
			    && arg8 + 8 > i_19_
			    && arg0 <= i_18_ && arg0 - -8 > i_18_) {
			    ObjectDefinition class187 = Class55.method612(i, -31);
			    int i_24_
				= (Class35.method468(0x7 & i_18_,
						     class187.anInt2668,
						     class187.anInt2702, 65536,
						     i_23_, i_19_ & 0x7, arg6)
				   + arg2);
			    int i_25_
				= Class131_Sub19.method1811(-6459, i_18_ & 0x7,
							    class187.anInt2668,
							    class187.anInt2702,
							    i_19_ & 0x7, i_23_,
							    arg6) + arg4;
			    if (i_24_ > 0 && i_25_ > 0
				&& (i_24_
				    < Class131_Sub41_Sub11_Sub1.anInt6546 + -1)
				&& (Class131_Sub2_Sub26.anInt5931 + -1
				    > i_25_)) {
				Class19 class19 = null;
				if (!arg5) {
				    int i_26_ = arg10;
				    if (((Class23_Sub2_Sub1
                            .aByteArrayArrayArray4992[1][i_24_]
                            [i_25_]) & 0x2) == 2)
					i_26_--;
				    if (i_26_ >= 0)
					class19 = arg3[i_26_];
				}
				Class145.method2168(true, i, arg1, (byte) -91,
						    arg10, class19, i_22_,
						    arg10, i_24_,
						    0x3 & i_23_ - -arg6, i_25_,
						    -1, arg5);
			    }
			}
		    }
		}
		if (arg11 == false)
		    break;
		anInt6204 = 12;
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495
			  (runtimeexception,
			   ("fq.H(" + arg0 + ','
			    + (arg1 != null ? "{...}" : "null") + ',' + arg2
			    + ',' + (arg3 != null ? "{...}" : "null") + ','
			    + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ','
			    + arg8 + ',' + (arg9 != null ? "{...}" : "null")
			    + ',' + arg10 + ',' + arg11 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method1943(int arg0, int arg1, int arg2, byte arg3,
				  GraphicsToolkit arg4, int arg5, Class19 arg6,
				  int arg7) {
	do {
	    try {
		anInt6215++;
		Interface6 interface6 = null;
		if (arg0 == 0)
		    interface6
			= (Interface6) Class43.method521(arg2, arg1, arg7);
		if (arg0 == 1)
		    interface6
			= (Interface6) Class106.method918(arg2, arg1, arg7);
		if (arg0 == 2)
		    interface6
			= (Interface6) (Class63.method662
					(arg2, arg1, arg7,
					 (aClass6218 != null ? aClass6218
					  : (aClass6218
					     = method1949("jagex.Interface6")))));
		if (arg0 == 3)
		    interface6
			= (Interface6) Class186.method2564(arg2, arg1, arg7);
		if (interface6 != null) {
		    int i = interface6.method21(-22056);
		    int i_27_ = interface6.method24((byte) -68);
		    ObjectDefinition class187
			= Class55.method612(interface6.method23((byte) -115),
					    121);
		    if (class187.method2582(0))
			Class144.method2157((byte) 123, class187, arg1, arg7,
					    arg2);
		    if (interface6.method19((byte) 122))
			interface6.method20(arg4, false);
		    if (arg0 == 0) {
			Class157.method2341(arg2, arg1, arg7);
			if (class187.anInt2693 != 0)
			    arg6.method237(i_27_, i, arg7, arg1, 42,
					   !class187.aBoolean2724,
					   class187.aBoolean2691);
		    } else if (arg0 == 1)
			Class131_Sub41_Sub21_Sub1.method2078(arg2, arg1, arg7);
		    else if (arg0 == 2) {
			Class220.method2826(arg2, arg1, arg7,
					    (aClass6218 != null ? aClass6218
					     : (aClass6218
						= method1949("jagex.Interface6"))));
			if (class187.anInt2693 != 0
			    && (arg1 + class187.anInt2702 < Class131_Sub41_Sub11_Sub1.anInt6546)
			    && (class187.anInt2702 + arg7 < Class131_Sub2_Sub26.anInt5931)
			    && (arg1 + class187.anInt2668
				< Class131_Sub41_Sub11_Sub1.anInt6546)
			    && (class187.anInt2668 + arg7
				< Class131_Sub2_Sub26.anInt5931))
			    arg6.method243(class187.anInt2668,
					   class187.aBoolean2691,
					   !class187.aBoolean2724, arg1,
					   -14463, class187.anInt2702, arg7,
					   i_27_);
		    } else if (arg0 == 3) {
				Class63.method664(arg2, arg1, arg7);
				if (class187.anInt2693 == 1)
					arg6.method241(-51, arg7, arg1);
			}
		}
		if (arg3 <= -75)
		    break;
		method1947((byte) 84);
	    } catch (RuntimeException runtimeexception) {
		throw Class131_Sub2_Sub6.method1495(runtimeexception,
						    ("fq.I(" + arg0 + ','
						     + arg1 + ',' + arg2 + ','
						     + arg3 + ','
						     + (arg4 != null ? "{...}"
							: "null")
						     + ',' + arg5 + ','
						     + (arg6 != null ? "{...}"
							: "null")
						     + ',' + arg7 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public void method1944(byte arg0) {
	if (anIntArray6210 != null) {
	    for (int i = 0; anIntArray6210.length > i; i++)
		anIntArray6210[i]
		    = Cryption.method2105(anIntArray6210[i], 32768);
	}
	anInt6214++;
	if (anIntArray6209 != null) {
	    for (int i = 0;
             i < anIntArray6209.length; i++)
		anIntArray6209[i]
		    = Cryption.method2105(anIntArray6209[i], 32768);
	}
	if (arg0 < 16)
	    method1936(false, 68L, null, 110);
    }
    
    public int method1945(char arg0, int arg1) {
	try {
	    anInt6211++;
	    if (anIntArray6210 == null)
		return -1;
	    for (int i = 0;
             i < anIntArray6210.length;
		 i++) {
		if (arg0 == aCharArray6195[i])
		    return anIntArray6210[i];
	    }
	    if (arg1 <= 80)
		aStringArray6206 = null;
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fq.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1946(int arg0) {
	anIntArrayArrayArray6200 = null;
	aStringArray6206 = null;
	if (arg0 != 32335)
	    anInt6212 = 62;
    }
    
    public static void method1947(byte arg0) {
	if (Class183_Sub1.aClass130_4960.method1163()) {
	    PacketParser.method1580(true);
	    Class183_Sub1.aClass130_4960
		.method1190(Class131_Sub2_Sub15.GameCanvas);
	    Class131_Sub2_Sub16.method1548((byte) -125);
	} else Class131_Sub2_Sub38.method1644(Stream.anInt4299, 100);
		anInt6207++;
	if (arg0 > -57)
	    anInt6213 = 108;
    }
    
    public int method1948(char arg0, byte arg1) {
	try {
	    anInt6201++;
	    if (anIntArray6209 == null)
		return -1;
	    for (int i = 0;
             i < anIntArray6209.length;
		 i++) {
		if (aCharArray6205[i] == arg0)
		    return anIntArray6209[i];
	    }
	    if (arg1 >= -119)
		anInt6204 = 110;
	    return -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("fq.M(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    /*synthetic*/ public static Class method1949(String arg0) {
	try {
	    return Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
