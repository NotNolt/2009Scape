package jagex;/* jagex.Class131_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

public class Class131_Sub9 extends Class131
{
    public int anInt4197;
    public static Stream aStream_4198
	= new Stream(new byte[5000]);
    public static int anInt4199;
    public static Font aFont4200;
    public Class207[] aClass207Array4201;
    public short[] aShortArray4202;
    public byte[] aByteArray4203;
    public static int anInt4204;
    public byte[] aByteArray4205;
    public int[] anIntArray4206;
    public byte[] aByteArray4207;
    public static int anInt4208;
    public static int anInt4209;
    public static int anInt4210;
    public static int anInt4211;
    public Class131_Sub12_Sub1[] aClass131_Sub12_Sub1Array4212;
    public static boolean aBoolean4213;
    public static int anInt4214;
    public static char[] aCharArray4215;
    public static boolean aBoolean4216 = false;
    public static int anInt4217;
    public static boolean aBoolean4218;
    public static int anInt4219;

    public static void method1685(byte arg0) {
	try {
	    Class127_Sub1.ContinueString = "Continuar";
	    Class12.SelectString = "Selecionar";
	    Class156.ShakeText = "tremor:";
	    Class53.AddYourselfToFriendsString
		= "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de amigos.";
	    Class184.RsLoadingPleaseWaitString = "RuneScape carregando. Aguarde...";
	    Class192.ConnectUpdateServerString
		= "Conectando ao servidor de atualiza\u00e7\u00e3o";
	    Class131_Sub2_Sub12.PleaseRemoveString = "Remova ";
	    Class44.Flash1ColorText = "flash1:";
	    Class165.HiddenString = "Oculto";
	    Class94.Flash3ColorText = "brilho3:";
	    Class126.CloseString = "Fechar";
	    Class131_Sub10.LoadedWordPackString = "Pacote de palavras carregado";
	    Class131_Sub18.FullFriendsListString
		= "Sua lista de amigos est\u00e1 cheia. O limite \u00e9 100 para os usu\u00e1rios n\u00e3o pagantes e 200 para os membros.";
	    Class131_Sub2_Sub9.UnableToFindString
		= "N\u00e3o \u00e9 poss\u00edvel encontrar ";
	    Class131_Sub41_Sub5.Glow2ColorText = "brilho2:";
	    Class131_Sub2_Sub11.CoinsBigMString = "M";
	    Class5.LoadingConfigString = "Carregando config - ";
	    Class176.GreenColorText = "verde:";
	    Class131_Sub41_Sub1.AddSelfToIgnoreListString
		= "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de ignorados.";
	    Class23_Sub2_Sub2.Drop = "Largar";
	    Class19.LoadedUpdateListString = "Lista de atualiza\u00e7\u00f5es carregada";
	    Class131_Sub2_Sub13.Glow1ColorText = "brilho1:";
	    Class131_Sub2_Sub11.CoinsMString = "M";
	    Class88.CoinsBigKString = "K";
	    Class220.ConnectionLostString = "Conex\u00e3o perdida.";
	    Class199.Library3DString = "Iniciando biblioteca 3D";
	    Class110_Sub1.HasLoggedInString = " entrou no jogo.";
	    Class189.MembersObjectString = "Objeto para membros";
	    Class133.LoadingDefaultsString = "Carregando padr\u00f5es - ";
	    Class46.RatingString = "qualifica\u00e7\u00e3o: ";
	    Class131_Sub41_Sub6.LoadedFontsString = "Fontes carregadas";
	    Class131_Sub11.RemoveFromIgnoreListString
		= " da sua lista de ignorados primeiro.";
	    Class184.OpenedTitleScreenString = "Tela t\u00edtulo aberta";
	    Class21.LoadWorldListDataString = "Carregando dados da lista de mundos";
	    Class131_Sub18.LoadedInputHandlerString = "Gerenciador de entradas carregado";
	    Class131_Sub2_Sub14.LoadingTitleScreenString = "Carregando tela t\u00edtulo - ";
	    Class131_Sub2_Sub30.LoadingTexturesString = "Carregando texturas - ";
	    Class121_Sub2.AlreadyOnFriendsListString
		= " j\u00e1 est\u00e1 na sua lista de amigos.";
	    Class126.CheckingForUpdatesString = "Verificando atualiza\u00e7\u00f5es - ";
	    Class23.YellowColorText = "amarelo:";
	    anInt4211++;
	    Class131_Sub19.ExamineString = "Examinar";
	    if (arg0 != 3)
		aCharArray4215 = null;
	    Class23_Sub1_Sub2.LoadedTitleScreenString = "Tela t\u00edtulo carregada";
	    Class110.ScrollText = "rolagem:";
	    Class131_Sub2_Sub10.LoadedTexturesString = "Texturas carregadas";
	    Class28.AllocatingMemoryString = "Alocando mem\u00f3ria";
	    Class131_Sub10.Flash2Text = "flash2:";
	    Class131_Sub41_Sub2.ConnectedUpdateServerString
		= "Conectado ao servidor de atualiza\u00e7\u00e3o";
	    Class131_Sub2_Sub9.PreparedSoundEngineString = "Mecanismo de som preparado";
	    Class131_Sub41_Sub11_Sub1.WalkHereString = "Caminhar para c\u00e1";
	    Class131_Sub6.LoadedWorldListDataString = "Dados da lista de mundos carregados";
	    Class218.ViloletColoredText = "roxo:";
	    Class131_Sub2_Sub30.DiscardString = "Descartar";
	    Class131_Sub2_Sub5.SkillString = "habilidade: ";
	    Class131_Sub8_Sub1.PleaseWaitString = "Aguarde...";
	    Class131_Sub41_Sub13.LoadingSpritesString = "Carregando sprites - ";
	    Class172.LoadedClientVariableString
		= "As vari\u00e1veis do sistema foram carregadas";
	    Class59.LoadedDefaultsString = "Padr\u00f5es carregados";
	    Class131_Sub41_Sub11.CreatedGameWorldString = "Universo de jogo criado";
	    Class131_Sub2_Sub31.LoadedSpritesString = "Sprites carregados";
	    Class120.IgnoreListFullString
		= "Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 100 usu\u00e1rios.";
	    Class121_Sub2.LoadingFontsString = "Carregando fontes - ";
	    Class171.WaveText = "onda:";
	    Class203.LiterallyJustAColonString = " ";
	    Class14.Glow3ColorText = "brilho3:";
	    FileSystem.UseOptionString = "Usar";
	    Class131_Sub37.LoadingInterfacesString = "Carregando interfaces - ";
	    Class121_Sub3_Sub1.CoinKString = "K";
	    Class22.RedColorText = "vermelho:";
	    Class100.Started3dLibraryString = "Biblioteca 3D iniciada";
	    Class180.AttackString = "Atacar";
	    Class155.SlideText = "deslizamento:";
	    Class14.LoadingPleaseWaitString = "Carregando. Aguarde.";
	    Class131_Sub2.HasLoggedOutString = " saiu do jogo.";
	    Class153.LoadingWordpackString = "Carregando pacote de palavras - ";
	    Class19.StellarDawnLoadingString = "Mechscape carregando. Aguarde...";
	    Class34.LoadedConfigString = "Config carregada";
	    Class131_Sub2_Sub4.LoadedInterfacesString = "Interfaces carregadas";
	    Class1_Sub2.LevelString = "n\u00edvel: ";
	    Class52.FriendsToIgnoreString = " da sua lista de amigos primeiro.";
	    Class121.AllocatedMemoryString = "Mem\u00f3ria alocada";
	    Class131_Sub2_Sub19.CyanColoredText = "cyan:";
	    Class144.FaceHereString = "Virar para c\u00e1";
	    Class182.CancelString = "Cancelar";
	    NPCDefinition.WhiteColorText = "branco:";
	    Class101.Wave2Text = "onda2:";
	    Class145.AttemptingToReestablishString
		= "Tentando reestabelecer conex\u00e3o. Aguarde.";
	    Class131_Sub41_Sub21_Sub2.ChooseOptionString
		= "Selecionar op\u00e7\u00e3o";
	    Class131_Sub3.LoadingString = "Carregando...";
	    Class131_Sub8.PleaseRemoveString = "Remova ";
	    Class33.Take = "Pegar";
	    Class17.OkayString = "Ok";
	    Class131_Sub2_Sub15.MoreOptionsString = " mais op\u00e7\u00f5es";
	    Class131_Sub18.AlreadyOnIgnoreListString
		= " j\u00e1 est\u00e1 na sua lista de ignorados.";
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hd.F(" + arg0 + ')');
	}
    }
    
    public static void method1686(Stream arg0, byte arg1) {
	try {
	    anInt4217++;
	    if (arg0.aByteArray4324.length - arg0.anInt4360 >= 1) {
		int i = arg0.readUnsignedByte(-35);
		if (i >= 0 && i <= 14) {
		    int i_0_;
		    if (i == 14)
			i_0_ = 36;
		    else if (i != 13) {
			if (i != 12) {
			    if (i != 11) {
				if (i == 10)
				    i_0_ = 32;
				else if (i != 9) {
				    if (i != 8) {
					if (i == 7)
					    i_0_ = 29;
					else if (i != 6) {
					    if (i == 5)
						i_0_ = 28;
					    else if (i == 4)
						i_0_ = 24;
					    else if (i != 3) {
						if (i != 2) {
						    if (i != 1)
							i_0_ = 19;
						    else
							i_0_ = 23;
						} else
						    i_0_ = 22;
					    } else
						i_0_ = 23;
					} else
					    i_0_ = 28;
				    } else
					i_0_ = 30;
				} else
				    i_0_ = 31;
			    } else
				i_0_ = 33;
			} else
			    i_0_ = 34;
		    } else
			i_0_ = 35;
		    if (i_0_ <= arg0.aByteArray4324.length - arg0.anInt4360) {
			Class134.anInt1809 = arg0.readUnsignedByte(-75);
			if (Class134.anInt1809 >= 1) {
			    if (Class134.anInt1809 > 4)
				Class134.anInt1809 = 4;
			} else
			    Class134.anInt1809 = 1;
			GraphicsToolkit.method1254(arg0.readUnsignedByte(116) == 1, -102);
			Class91.aBoolean1180
			    = arg0.readUnsignedByte(-111) == 1;
			Class135.aBoolean1818 = arg0.readUnsignedByte(105) == 1;
			Class183.aBoolean2613
			    = arg0.readUnsignedByte(54) == 1;
			Class171.anInt2284 = arg0.readUnsignedByte(96) != 1 ? 0 : 1;
			Class131_Sub33.aBoolean4557
			    = arg0.readUnsignedByte(88) == 1;
			Class103.aBoolean1349 = arg0.readUnsignedByte(65) == 1;
			Class121.aBoolean1588
			    = arg0.readUnsignedByte(-15) == 1;
			Class131_Sub2_Sub16.anInt5779 = arg0.readUnsignedByte(106);
			if (Class131_Sub2_Sub16.anInt5779 > 2)
			    Class131_Sub2_Sub16.anInt5779 = 2;
			if (i >= 2)
			    Class167.aBoolean2235 = arg0.readUnsignedByte(-15) == 1;
			else {
			    Class167.aBoolean2235 = arg0.readUnsignedByte(54) == 1;
			    arg0.readUnsignedByte(-63);
			}
			Class23_Sub1_Sub2.aBoolean5159
			    = arg0.readUnsignedByte(-116) == 1;
			Class131_Sub8_Sub1.aBoolean6089
			    = arg0.readUnsignedByte(123) == 1;
			Class131_Sub7.anInt4165 = arg0.readUnsignedByte(-64);
			if (Class131_Sub7.anInt4165 > 2)
			    Class131_Sub7.anInt4165 = 2;
			Class131_Sub41_Sub21.anInt6442
			    = Class131_Sub7.anInt4165;
			Class58.aBoolean765
			    = arg0.readUnsignedByte(-124) == 1;
			Class23_Sub4_Sub2.anInt5380 = arg0.readUnsignedByte(116);
			if (Class23_Sub4_Sub2.anInt5380 > 127)
			    Class23_Sub4_Sub2.anInt5380 = 127;
			Class212.anInt3112 = arg0.readUnsignedByte(-31);
			InputStream_Sub1.anInt55 = arg0.readUnsignedByte(-48);
			if (InputStream_Sub1.anInt55 > 127)
			    InputStream_Sub1.anInt55 = 127;
			if (i >= 1) {
			    Class90.anInt1176 = arg0.readUnsignedShort(8104);
			    Class14.anInt163 = arg0.readUnsignedShort(8104);
			}
			if (i >= 3 && i < 6)
			    arg0.readUnsignedByte(-28);
			if (i >= 4) {
			    int i_1_ = arg0.readUnsignedByte(78);
			    if (i_1_ < 0
				|| i_1_ > 2)
				i_1_ = 0;
			    if (Class1_Sub4.anInt3554 < 96)
				i_1_ = 0;
			    Class131_Sub41_Sub19.method2060(i_1_, 0);
			}
			if (i >= 5)
			    Class46_Sub1.anInt3787 = arg0.readUnsignedInt(-2);
			int i_2_ = 0;
			if (i >= 6)
			    Class91.anInt1184 = i_2_ = arg0.readUnsignedByte(98);
			if (Class91.anInt1184 != 1
			    && Class91.anInt1184 != 2)
			    Class91.anInt1184 = 2;
			if (i >= 7)
			    Class131_Sub41_Sub7.aBoolean6255
				= arg0.readUnsignedByte(117) == 1;
			if (i >= 8)
			    Class131_Sub6.aBoolean4143
				= arg0.readUnsignedByte(86) == 1;
			if (i >= 9)
			    Class141.anInt1876 = arg0.readUnsignedByte(-92);
			if (Class141.anInt1876 < 0
			    || Class141.anInt1876 > 3)
			    Class141.anInt1876 = 0;
			if (i >= 10)
			    Class177.aBoolean2530 = arg0.readUnsignedByte(71) != 0;
			if (i >= 11)
			    Class40.aBoolean533 = arg0.readUnsignedByte(-72) != 0;
			if (i >= 12)
			    Class171.anInt2284 = arg0.readUnsignedByte(85);
			if (Class171.anInt2284 < 0
			    || Class171.anInt2284 > 2)
			    Class171.anInt2284 = 1;
			if (i >= 13)
			    Class131_Sub13.aBoolean4268
				= arg0.readUnsignedByte(55) == 1;
			if (arg1 >= -72)
			    aBoolean4213 = false;
			if (i >= 14)
			    Class131_Sub2_Sub10_Sub1.anInt6537
				= arg0.readUnsignedByte(-59);
			else if (i_2_ != 0)
			    Class131_Sub2_Sub10_Sub1.anInt6537 = 1;
			else
			    Class131_Sub2_Sub10_Sub1.anInt6537 = 2;
			if ((Class131_Sub2_Sub10_Sub1.anInt6537 < 0)
			    || Class131_Sub2_Sub10_Sub1.anInt6537 > 3)
			    Class131_Sub2_Sub10_Sub1.anInt6537 = 2;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hd.E("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ',' + arg1 + ')'));
	}
    }
    
    public static Class131_Sub2 method1687(byte arg0, int arg1) {
	try {
	    if (arg0 <= 20)
		return null;
	    anInt4214++;
	    int i = arg1;
	while_207_:
	    do {
	    while_206_:
		do {
		while_205_:
		    do {
		    while_204_:
			do {
			while_203_:
			    do {
			    while_202_:
				do {
				while_201_:
				    do {
				    while_200_:
					do {
					while_199_:
					    do {
					    while_198_:
						do {
						while_197_:
						    do {
						    while_196_:
							do {
							while_195_:
							    do {
							    while_194_:
								do {
								while_193_:
								    do {
								    while_192_:
									do {
									while_191_:
									    do {
									    while_190_:
										do {
										while_189_:
										    do {
										    while_188_:
											do {
											while_187_:
											    do {
											    while_186_:
												do {
												while_185_:
												    do {
												    while_184_:
													do {
													while_183_:
													    do {
													    while_182_:
														do {
														while_181_:
														    do {
														    while_180_:
															do {
															while_179_:
															    do {
															    while_178_:
																do {
																while_177_:
																    do {
																    while_176_:
																	do {
																	while_175_:
																	    do {
																	    while_174_:
																		do {
																		while_173_:
																		    do {
																		    while_172_:
																			do {
																			while_171_:
																			    do {
																			    while_170_:
																				do {
																				    do {
																					if (i != 0) {
																					    if (i != 1) {
																						if (i != 2) {
																						    if (i != 3) {
																							if (i != 4) {
																							    if (i != 5) {
																								if (i != 6) {
																								    if (i != 7) {
																									if (i != 8) {
																									    if (i != 9) {
																										if (i != 10) {
																										    if (i != 11) {
																											if (i != 12) {
																											    if (i != 13) {
																												if (i != 14) {
																												    if (i != 15) {
																													if (i != 16) {
																													    if (i != 17) {
																														if (i != 18) {
																														    if (i != 19) {
																															if (i != 20) {
																															    if (i != 21) {
																																if (i != 22) {
																																    if (i != 23) {
																																	if (i != 24) {
																																	    if (i != 25) {
																																		if (i != 26) {
																																		    if (i != 27) {
																																			if (i != 28) {
																																			    if (i != 29) {
																																				if (i != 30) {
																																				    if (i != 31) {
																																					if (i != 32) {
																																					    if (i != 33) {
																																						if (i != 34) {
																																						    if (i != 35) {
																																							if (i != 36) {
																																							    if (i != 37) {
																																								if (i != 38) {
																																								    if (i != 39)
																																									break while_207_;
																																								} else
																																								    break while_205_;
																																								break while_206_;
																																							    }
																																							} else
																																							    break while_203_;
																																							break while_204_;
																																						    }
																																						} else
																																						    break while_201_;
																																						break while_202_;
																																					    }
																																					} else
																																					    break while_199_;
																																					break while_200_;
																																				    }
																																				} else
																																				    break while_197_;
																																				break while_198_;
																																			    }
																																			} else
																																			    break while_195_;
																																			break while_196_;
																																		    }
																																		} else
																																		    break while_193_;
																																		break while_194_;
																																	    }
																																	} else
																																	    break while_191_;
																																	break while_192_;
																																    }
																																} else
																																    break while_189_;
																																break while_190_;
																															    }
																															} else
																															    break while_187_;
																															break while_188_;
																														    }
																														} else
																														    break while_185_;
																														break while_186_;
																													    }
																													} else
																													    break while_183_;
																													break while_184_;
																												    }
																												} else
																												    break while_181_;
																												break while_182_;
																											    }
																											} else
																											    break while_179_;
																											break while_180_;
																										    }
																										} else
																										    break while_177_;
																										break while_178_;
																									    }
																									} else
																									    break while_175_;
																									break while_176_;
																								    }
																								} else
																								    break while_173_;
																								break while_174_;
																							    }
																							} else
																							    break while_171_;
																							break while_172_;
																						    }
																						} else
																						    break;
																						break while_170_;
																					    }
																					} else
																					    return new Class131_Sub2_Sub4();
																					return new Class131_Sub2_Sub33();
																				    } while (false);
																				    return new Class131_Sub2_Sub26();
																				} while (false);
																				return new Class131_Sub2_Sub35();
																			    } while (false);
																			    return new Class131_Sub2_Sub24();
																			} while (false);
																			return new Class131_Sub2_Sub32();
																		    } while (false);
																		    return new Class131_Sub2_Sub14();
																		} while (false);
																		return new Class131_Sub2_Sub36();
																	    } while (false);
																	    return new Class131_Sub2_Sub7();
																	} while (false);
																	return new Class131_Sub2_Sub28();
																    } while (false);
																    return new Class131_Sub2_Sub25();
																} while (false);
																return new Class131_Sub2_Sub39();
															    } while (false);
															    return new Class131_Sub2_Sub20();
															} while (false);
															return new Class131_Sub2_Sub11();
														    } while (false);
														    return new Class131_Sub2_Sub13();
														} while (false);
														return new Class131_Sub2_Sub15();
													    } while (false);
													    return new Class131_Sub2_Sub38();
													} while (false);
													return new Class131_Sub2_Sub9();
												    } while (false);
												    return new Class131_Sub2_Sub10_Sub1();
												} while (false);
												return new Class131_Sub2_Sub29();
											    } while (false);
											    return new Class131_Sub2_Sub1();
											} while (false);
											return new Class131_Sub2_Sub22();
										    } while (false);
										    return new Class131_Sub2_Sub34();
										} while (false);
										return new Class131_Sub2_Sub18();
									    } while (false);
									    return new Class131_Sub2_Sub3();
									} while (false);
									return new Class131_Sub2_Sub31();
								    } while (false);
								    return (new Class131_Sub2_Sub37
									    ());
								} while (false);
								return (new Class131_Sub2_Sub16
									());
							    } while (false);
							    return (new Class131_Sub2_Sub27
								    ());
							} while (false);
							return (new Class131_Sub2_Sub2
								());
						    } while (false);
						    return (new Class131_Sub2_Sub21
							    ());
						} while (false);
						return (new Class131_Sub2_Sub5
							());
					    } while (false);
					    return new Class131_Sub2_Sub8();
					} while (false);
					return new Class131_Sub2_Sub19();
				    } while (false);
				    return new Class131_Sub2_Sub17();
				} while (false);
				return new Class131_Sub2_Sub30();
			    } while (false);
			    return new Class131_Sub2_Sub12();
			} while (false);
			return new PacketParser();
		    } while (false);
		    return new Class131_Sub2_Sub6();
		} while (false);
		return new Class131_Sub2_Sub10();
	    } while (false);
	    return null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hd.A(" + arg0 + ',' + arg1
						 + ')'));
	}
    }
    
    public static void method1688(byte arg0) {
	try {
	    aFont4200 = null;
	    aCharArray4215 = null;
	    if (arg0 != -26)
		method1690(-91);
	    aStream_4198 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hd.B(" + arg0 + ')');
	}
    }
    
    public void method1689(byte arg0) {
	try {
	    if (arg0 != 21)
		method1689((byte) 29);
	    anIntArray4206 = null;
	    anInt4209++;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hd.C(" + arg0 + ')');
	}
    }
    
    public static boolean method1690(int arg0) {
	try {
	    if (arg0 != -11354)
		aCharArray4215 = null;
	    anInt4219++;
	    try {
		if (Class214.anInt3139 == 2) {
		    if (Class188.aClass131_Sub26_2757 == null) {
			Class188.aClass131_Sub26_2757
			    = Class131_Sub26.method1832((Class23_Sub4_Sub5
							 .aClass158_5111),
							Cryption.anInt1824,
							(Class131_Sub20
							 .anInt4432));
			if (Class188.aClass131_Sub26_2757 == null)
			    return false;
		    }
		    if (Class131_Sub4.aClass74_4130 == null)
			Class131_Sub4.aClass74_4130
			    = new Class74(Class121_Sub3_Sub1.aClass158_5435,
					  Class6.aClass158_92);
		    if (Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106.method1375
			(Class131_Sub4.aClass74_4130, Class128.aClass158_1745,
			 (byte) 35, Class188.aClass131_Sub26_2757, 22050)) {
			Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106
			    .method1382(0);
			Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106
			    .method1377(1570943944, Class183_Sub1.anInt4962);
			Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106.method1384
			    (Class83.aBoolean1094, -128,
			     Class188.aClass131_Sub26_2757);
			Class23_Sub4_Sub5.aClass158_5111 = null;
			Class214.anInt3139 = 0;
			Class131_Sub4.aClass74_4130 = null;
			Class188.aClass131_Sub26_2757 = null;
			return true;
		    }
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
		Class131_Sub8_Sub1.aClass131_Sub1_Sub1_6106.method1368(false);
		Class131_Sub4.aClass74_4130 = null;
		Class214.anInt3139 = 0;
		Class23_Sub4_Sub5.aClass158_5111 = null;
		Class188.aClass131_Sub26_2757 = null;
	    }
	    return false;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						"hd.D(" + arg0 + ')');
	}
    }
    
    public static void method1691(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    anInt4208++;
	    float f = (float) Class127.anInt1730 / (float) Class127.anInt1716;
	    int i = arg0;
	    int i_3_ = arg2;
	    if (!(f < 1.0F))
		i = (int) ((float) arg2 / f);
	    else
		i_3_ = (int) (f * (float) arg0);
	    arg4 -= (-i_3_ + arg2) / 2;
	    arg3 -= (arg0 + -i) / 2;
	    Class146.anInt1940 = -1;
	    Class131_Sub31.anInt4532 = Class127.anInt1716 * arg3 / i;
	    if (arg1 == 23) {
		Class189.anInt2768 = -1;
		Class197.anInt2875
		    = -(arg4 * Class127.anInt1730 / i_3_) + Class127.anInt1730;
		Class131_Sub13.method1707(127);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hd.H(" + arg0 + ',' + arg1
						 + ',' + arg2 + ',' + arg3
						 + ',' + arg4 + ')'));
	}
    }
    
    public boolean method1692(int[] arg0, Class74 arg1, int arg2,
			      byte[] arg3) {
	try {
	    if (arg2 != 1)
		method1687((byte) 48, -73);
	    anInt4199++;
	    boolean bool = true;
	    int i = 0;
	    Class131_Sub12_Sub1 class131_sub12_sub1 = null;
	    for (int i_4_ = 0; i_4_ < 128; i_4_++) {
		if (arg3 == null || arg3[i_4_] != 0) {
		    int i_5_ = anIntArray4206[i_4_];
		    if (i_5_ != 0) {
			if (i_5_ != i) {
			    i = i_5_;
			    if ((--i_5_ & 0x1) != 0)
				class131_sub12_sub1
				    = arg1.method757(i_5_ >> -1517384638,
						     arg2 + -93, arg0);
			    else
				class131_sub12_sub1
				    = arg1.method760((byte) 94, arg0,
						     i_5_ >> 1410588578);
			    if (class131_sub12_sub1 == null)
				bool = false;
			}
			if (class131_sub12_sub1 != null) {
			    aClass131_Sub12_Sub1Array4212[i_4_]
				= class131_sub12_sub1;
			    anIntArray4206[i_4_] = 0;
			}
		    }
		}
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495
		      (runtimeexception,
		       ("hd.G(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public Class131_Sub9() {
	/* empty */
    }
    
    public Class131_Sub9(byte[] arg0) {
	try {
	    aClass131_Sub12_Sub1Array4212 = new Class131_Sub12_Sub1[128];
	    aByteArray4205 = new byte[128];
	    aByteArray4203 = new byte[128];
	    aByteArray4207 = new byte[128];
	    aShortArray4202 = new short[128];
	    anIntArray4206 = new int[128];
	    aClass207Array4201 = new Class207[128];
	    Stream stream = new Stream(arg0);
	    int i;
	    for (i = 0;
		 (stream.aByteArray4324[stream.anInt4360 - -i]
		  != 0);
		 i++) {
		/* empty */
	    }
	    byte[] is = new byte[i];
	    for (int i_6_ = 0; i_6_ < i; i_6_++)
		is[i_6_] = stream.readSignedByte((byte) 127);
	    stream.anInt4360++;
	    i++;
	    int i_7_ = stream.anInt4360;
	    stream.anInt4360 += i;
	    int i_8_;
	    for (i_8_ = 0; ((stream.aByteArray4324
                [i_8_ + stream.anInt4360]) != 0); i_8_++) {
		/* empty */
	    }
	    byte[] is_9_ = new byte[i_8_];
	    for (int i_10_ = 0; i_8_ > i_10_;
             i_10_++)
		is_9_[i_10_] = stream.readSignedByte((byte) 127);
	    stream.anInt4360++;
	    i_8_++;
	    int i_11_ = stream.anInt4360;
	    stream.anInt4360 += i_8_;
	    int i_12_;
	    for (i_12_ = 0; ((stream.aByteArray4324
                [stream.anInt4360 - -i_12_]) != 0); i_12_++) {
		/* empty */
	    }
	    byte[] is_13_ = new byte[i_12_];
	    for (int i_14_ = 0; i_12_ > i_14_;
             i_14_++)
		is_13_[i_14_] = stream.readSignedByte((byte) 127);
	    stream.anInt4360++;
	    byte[] is_15_ = new byte[++i_12_];
	    int i_16_;
	    if (i_12_ > 1) {
		is_15_[1] = (byte) 1;
		i_16_ = 2;
		int i_17_ = 1;
		for (int i_18_ = 2;
             i_18_ < i_12_; i_18_++) {
		    int i_19_ = stream.readUnsignedByte(-35);
		    if (i_19_ != 0) {
			if (i_19_ <= i_17_)
			    i_19_--;
			i_17_ = i_19_;
		    } else
			i_17_ = i_16_++;
		    is_15_[i_18_] = (byte) i_17_;
		}
	    } else
		i_16_ = i_12_;
	    Class207[] class207s = new Class207[i_16_];
	    for (int i_20_ = 0; i_20_ < class207s.length; i_20_++) {
		Class207 class207 = class207s[i_20_] = new Class207();
		int i_21_ = stream.readUnsignedByte(79);
		if (i_21_ > 0)
		    class207.aByteArray3034 = new byte[i_21_ * 2];
		i_21_ = stream.readUnsignedByte(-128);
		if (i_21_ > 0) {
		    class207.aByteArray3031 = new byte[2 + i_21_ * 2];
		    class207.aByteArray3031[1] = (byte) 64;
		}
	    }
	    int i_22_ = stream.readUnsignedByte(-22);
	    byte[] is_23_
		= i_22_ <= 0 ? null : new byte[i_22_ * 2];
	    i_22_ = stream.readUnsignedByte(-122);
	    byte[] is_24_
		= i_22_ > 0 ? new byte[2 * i_22_] : null;
	    int i_25_;
	    for (i_25_ = 0; ((stream.aByteArray4324
			      [i_25_ + stream.anInt4360])
			     != 0); i_25_++) {
		/* empty */
	    }
	    byte[] is_26_ = new byte[i_25_];
	    for (int i_27_ = 0; i_27_ < i_25_; i_27_++)
		is_26_[i_27_] = stream.readSignedByte((byte) 127);
	    stream.anInt4360++;
	    i_25_++;
	    int i_28_ = 0;
	    for (int i_29_ = 0; i_29_ < 128; i_29_++) {
		i_28_ += stream.readUnsignedByte(-111);
		aShortArray4202[i_29_] = (short) i_28_;
	    }
	    i_28_ = 0;
	    for (int i_30_ = 0; i_30_ < 128; i_30_++) {
		i_28_ += stream.readUnsignedByte(-26);
		aShortArray4202[i_30_] += i_28_ << 1656974632;
	    }
	    int i_31_ = 0;
	    int i_32_ = 0;
	    int i_33_ = 0;
	    for (int i_34_ = 0; i_34_ < 128; i_34_++) {
		if (i_31_ == 0) {
		    if (i_32_ >= is_26_.length)
			i_31_ = -1;
		    else
			i_31_ = is_26_[i_32_++];
		    i_33_ = stream.method1739(true);
		}
		aShortArray4202[i_34_]
		    += Class90.method841(2, i_33_ + -1) << -1905546962;
		i_31_--;
		anIntArray4206[i_34_] = i_33_;
	    }
	    i_32_ = 0;
	    i_31_ = 0;
	    int i_35_ = 0;
	    for (int i_36_ = 0; i_36_ < 128; i_36_++) {
		if (anIntArray4206[i_36_] != 0) {
		    if (i_31_ == 0) {
			i_35_ = stream.aByteArray4324[i_7_++] + -1;
			if (is.length > i_32_)
			    i_31_ = is[i_32_++];
			else
			    i_31_ = -1;
		    }
		    aByteArray4205[i_36_] = (byte) i_35_;
		    i_31_--;
		}
	    }
	    i_31_ = 0;
	    i_32_ = 0;
	    int i_37_ = 0;
	    for (int i_38_ = 0; i_38_ < 128; i_38_++) {
		if (anIntArray4206[i_38_] != 0) {
		    if (i_31_ == 0) {
			i_37_ = (stream.aByteArray4324[i_11_++] - -16
				 << 1571852866);
			if (is_9_.length <= i_32_)
			    i_31_ = -1;
			else
			    i_31_ = is_9_[i_32_++];
		    }
		    i_31_--;
		    aByteArray4203[i_38_] = (byte) i_37_;
		}
	    }
	    i_32_ = 0;
	    i_31_ = 0;
	    Class207 class207 = null;
	    for (int i_39_ = 0; i_39_ < 128; i_39_++) {
		if (anIntArray4206[i_39_] != 0) {
		    if (i_31_ == 0) {
			class207 = class207s[is_15_[i_32_]];
			if (i_32_ >= is_13_.length)
			    i_31_ = -1;
			else
			    i_31_ = is_13_[i_32_++];
		    }
		    aClass207Array4201[i_39_] = class207;
		    i_31_--;
		}
	    }
	    i_32_ = 0;
	    i_31_ = 0;
	    int i_40_ = 0;
	    for (int i_41_ = 0; i_41_ < 128; i_41_++) {
		if (i_31_ == 0) {
		    if (i_32_ >= is_26_.length)
			i_31_ = -1;
		    else
			i_31_ = is_26_[i_32_++];
		    if (anIntArray4206[i_41_] > 0)
			i_40_ = 1 + stream.readUnsignedByte(-106);
		}
		aByteArray4207[i_41_] = (byte) i_40_;
		i_31_--;
	    }
	    anInt4197 = 1 + stream.readUnsignedByte(-74);
	    for (int i_42_ = 0; i_42_ < i_16_;
             i_42_++) {
		Class207 class207_43_ = class207s[i_42_];
		if (class207_43_.aByteArray3034 != null) {
		    for (int i_44_ = 1;
			 i_44_ < class207_43_.aByteArray3034.length;
			 i_44_ += 2)
			class207_43_.aByteArray3034[i_44_]
			    = stream.readSignedByte((byte) 127);
		}
		if (class207_43_.aByteArray3031 != null) {
		    for (int i_45_ = 3;
			 -2 + class207_43_.aByteArray3031.length > i_45_;
			 i_45_ += 2)
			class207_43_.aByteArray3031[i_45_]
			    = stream.readSignedByte((byte) 127);
		}
	    }
	    if (is_23_ != null) {
		for (int i_46_ = 1;
             i_46_ < is_23_.length;
		     i_46_ += 2)
		    is_23_[i_46_] = stream.readSignedByte((byte) 127);
	    }
	    if (is_24_ != null) {
		for (int i_47_ = 1; i_47_ < is_24_.length; i_47_ += 2)
		    is_24_[i_47_] = stream.readSignedByte((byte) 127);
	    }
	    for (int i_48_ = 0; i_48_ < i_16_;
             i_48_++) {
		Class207 class207_49_ = class207s[i_48_];
		if (class207_49_.aByteArray3031 != null) {
		    i_28_ = 0;
		    for (int i_50_ = 2;
			 (i_50_ < class207_49_.aByteArray3031.length);
			 i_50_ += 2) {
			i_28_ = i_28_ + 1 + stream.readUnsignedByte(126);
			class207_49_.aByteArray3031[i_50_] = (byte) i_28_;
		    }
		}
	    }
	    for (int i_51_ = 0; i_51_ < i_16_; i_51_++) {
		Class207 class207_52_ = class207s[i_51_];
		if (class207_52_.aByteArray3034 != null) {
		    i_28_ = 0;
		    for (int i_53_ = 2;
			 i_53_ < class207_52_.aByteArray3034.length;
			 i_53_ += 2) {
			i_28_ += 1 - -stream.readUnsignedByte(-59);
			class207_52_.aByteArray3034[i_53_] = (byte) i_28_;
		    }
		}
	    }
	    if (is_23_ != null) {
		i_28_ = stream.readUnsignedByte(63);
		is_23_[0] = (byte) i_28_;
		for (int i_54_ = 2;
             is_23_.length > i_54_;
		     i_54_ += 2) {
		    i_28_ = i_28_ + 1 - -stream.readUnsignedByte(-38);
		    is_23_[i_54_] = (byte) i_28_;
		}
		int i_55_ = is_23_[0];
		int i_56_ = is_23_[1];
		for (int i_57_ = 0; i_57_ < i_55_; i_57_++)
		    aByteArray4207[i_57_]
			= (byte) (32 + aByteArray4207[i_57_] * i_56_
				  >> -2083738842);
		int i_58_ = 2;
		while (i_58_ < is_23_.length) {
		    int i_59_ = is_23_[i_58_];
		    int i_60_ = is_23_[i_58_ + 1];
		    int i_61_
			= i_56_ * (-i_55_ + i_59_) - -((-i_55_ + i_59_) / 2);
		    for (int i_62_ = i_55_; i_62_ < i_59_; i_62_++) {
			int i_63_
			    = Class81.method792(i_61_, -i_55_ + i_59_, true);
			aByteArray4207[i_62_]
			    = (byte) (32 + i_63_ * aByteArray4207[i_62_]
				      >> -1616301466);
			i_61_ += -i_56_ + i_60_;
		    }
		    i_58_ += 2;
		    i_55_ = i_59_;
		    i_56_ = i_60_;
		}
		Object object = null;
		for (int i_64_ = i_55_; i_64_ < 128; i_64_++)
		    aByteArray4207[i_64_]
			= (byte) (i_56_ * aByteArray4207[i_64_] + 32
				  >> -471466106);
	    }
	    if (is_24_ != null) {
		i_28_ = stream.readUnsignedByte(-39);
		is_24_[0] = (byte) i_28_;
		for (int i_65_ = 2; i_65_ < is_24_.length; i_65_ += 2) {
		    i_28_ -= -1 - stream.readUnsignedByte(110);
		    is_24_[i_65_] = (byte) i_28_;
		}
		int i_66_ = is_24_[0];
		int i_67_ = is_24_[1] << -489001439;
		for (int i_68_ = 0; i_66_ > i_68_; i_68_++) {
		    int i_69_ = (aByteArray4203[i_68_] & 0xff) - -i_67_;
		    if (i_69_ < 0)
			i_69_ = 0;
		    if (i_69_ > 128)
			i_69_ = 128;
		    aByteArray4203[i_68_] = (byte) i_69_;
		}
		int i_70_ = 2;
		while (i_70_ < is_24_.length) {
		    int i_71_ = is_24_[i_70_];
		    int i_72_ = is_24_[1 + i_70_] << -1309300159;
		    int i_73_ = (i_71_ - i_66_) * i_67_ + (-i_66_ + i_71_) / 2;
		    for (int i_74_ = i_66_; i_71_ > i_74_; i_74_++) {
			int i_75_
			    = Class81.method792(i_73_, -i_66_ + i_71_, true);
			int i_76_ = i_75_ + (0xff & aByteArray4203[i_74_]);
			if (i_76_ < 0)
			    i_76_ = 0;
			if (i_76_ > 128)
			    i_76_ = 128;
			i_73_ += -i_67_ + i_72_;
			aByteArray4203[i_74_] = (byte) i_76_;
		    }
		    i_67_ = i_72_;
		    i_70_ += 2;
		    i_66_ = i_71_;
		}
		for (int i_77_ = i_66_; i_77_ < 128; i_77_++) {
		    int i_78_ = (aByteArray4203[i_77_] & 0xff) + i_67_;
		    if (i_78_ < 0)
			i_78_ = 0;
		    if (i_78_ > 128)
			i_78_ = 128;
		    aByteArray4203[i_77_] = (byte) i_78_;
		}
		Object object = null;
	    }
	    for (int i_79_ = 0; i_16_ > i_79_;
             i_79_++)
		class207s[i_79_].anInt3024 = stream.readUnsignedByte(-72);
	    for (int i_80_ = 0; i_80_ < i_16_; i_80_++) {
		Class207 class207_81_ = class207s[i_80_];
		if (class207_81_.aByteArray3034 != null)
		    class207_81_.anInt3020 = stream.readUnsignedByte(-89);
		if (class207_81_.aByteArray3031 != null)
		    class207_81_.anInt3030 = stream.readUnsignedByte(-45);
		if (class207_81_.anInt3024 > 0)
		    class207_81_.anInt3026 = stream.readUnsignedByte(-115);
	    }
	    for (int i_82_ = 0; i_82_ < i_16_; i_82_++)
		class207s[i_82_].anInt3033 = stream.readUnsignedByte(113);
	    for (int i_83_ = 0; i_83_ < i_16_; i_83_++) {
		Class207 class207_84_ = class207s[i_83_];
		if (class207_84_.anInt3033 > 0)
		    class207_84_.anInt3021 = stream.readUnsignedByte(-119);
	    }
	    for (int i_85_ = 0; i_85_ < i_16_; i_85_++) {
		Class207 class207_86_ = class207s[i_85_];
		if (class207_86_.anInt3021 > 0)
		    class207_86_.anInt3032 = stream.readUnsignedByte(-19);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class131_Sub2_Sub6.method1495(runtimeexception,
						("hd.<init>("
						 + (arg0 != null ? "{...}"
						    : "null")
						 + ')'));
	}
    }
    
    static {
	aCharArray4215
	    = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			   'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			   't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2',
			   '3', '4', '5', '6', '7', '8', '9' };
	aBoolean4218 = false;
	aBoolean4213 = true;
    }
}
