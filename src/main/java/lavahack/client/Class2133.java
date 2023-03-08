//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.text.*;

public class Class2133 extends Class1514
{
    private static final int Field17697;
    private static final int Field17698;
    private int Field17699;
    private int Field17700;
    private boolean Field17701;
    private boolean Field17702;
    private Class994 Field17703;
    private String[] Field17704;
    private int Field17705;
    private boolean Field17706;
    private int Field17707;
    private String Field17708 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2133(final Class1876 class1876, final int field17699, final int field17700, final String[] field17701, final int field17702) {
        super(class1876);
        this.Field17699 = field17699;
        this.Field17700 = field17700;
        this.Field17704 = field17701;
        this.Field17705 = field17702;
        this.Method676(field17699);
        this.Method7671();
    }
    
    public Class2133(final Class1876 class1876, final String[] array, final int n) {
        this(class1876, 180, 22, array, n);
    }
    
    private void Method7671() {
        if (this.Field17706) {
            this.Method678(this.Field17700 * this.Field17704.length + 4);
        }
        else {
            this.Method678(this.Field17700);
        }
    }
    
    public void Method668() {
        this.Method7671();
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Method677(), Class1039.Field12570);
        if (this.Field17701) {
            this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Field17700, Class1039.Field12569);
        }
        else if (this.Field17702) {
            int n = this.Field17700 + 4;
            for (int i = 0; i < this.Field17704.length; ++i) {
                if (i != this.Field17705) {
                    int field17700 = this.Field17700;
                    Label_0179: {
                        if (this.Field17705 == 0) {
                            if (this.Field17705 == this.Field17704.length - 1) {
                                if (i != this.Field17704.length - 2) {
                                    break Label_0179;
                                }
                            }
                            else if (i != this.Field17704.length - 1) {
                                break Label_0179;
                            }
                        }
                        ++field17700;
                    }
                    if (this.Field17707 >= this.Method673() + n && this.Field17707 <= this.Method673() + n + this.Field17700) {
                        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + n), (double)this.Method675(), (double)this.Field17700, Class1039.Field12569);
                        break;
                    }
                    n += field17700;
                }
            }
        }
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2445((double)(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - this.Field17700), (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Field17700, (double)this.Method677(), (this.Field17701 || this.Field17706) ? Class1039.Field12570 : Class1039.Field12569);
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2446((double)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (double)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, (double)this.Method675(), (double)this.Method677(), 1.0f, (this.Field17701 && !this.Field17706) ? Class1039.Field12571 : Class1039.Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect((this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() - this.Field17700) / 2, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf / 2, (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675()) / 2, (this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677()) / 2, (this.Field17701 || this.Field17706) ? Class1039.Field12570 : Class1039.Field12569, null.Field11788.Method367());
        }
        final String s = (this.Field17705 != -1) ? this.Field17704[this.Field17705] : (TextFormatting.RED + "ERROR");
        this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + 4, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field17700 / 2 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(s) / 2, s, Class1039.Field12573);
        if (this.Field17706) {
            int n2 = this.Field17700 + 4;
            for (int j = 0; j < this.Field17704.length; ++j) {
                if (j != this.Field17705) {
                    int field17701 = this.Field17700;
                    Label_0650: {
                        if (this.Field17705 == 0) {
                            if (this.Field17705 == this.Field17704.length - 1) {
                                if (j != this.Field17704.length - 2) {
                                    break Label_0650;
                                }
                            }
                            else if (j != this.Field17704.length - 1) {
                                break Label_0650;
                            }
                        }
                        ++field17701;
                    }
                    this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2448(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + 4, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + n2 + (11 - this.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method2450(this.Field17704[j]) / 2), this.Field17704[j], Class1039.Field12573);
                    n2 += field17701;
                }
            }
        }
    }
    
    public void Method669() {
    }
    
    public boolean Method683(final int n, final int n2, final boolean b) {
        this.Method7672(n, n2, b);
        return false;
    }
    
    private void Method7672(final int uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, final int field17707, final boolean b) {
        this.Field17701 = (!b && uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && field17707 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && field17707 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field17700);
        this.Field17702 = (!b && uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV >= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi && field17707 >= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf && uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV <= this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi + this.Method675() && field17707 <= this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Method677());
        this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        this.Field17707 = field17707;
    }
    
    public boolean Method684(final int n, final int n2, final int n3, final boolean b) {
        this.Method7672(n2, n3, b);
        if (n != 0) {
            return false;
        }
        if (this.Field17701) {
            this.Method7677(!this.Field17706);
            this.Method7671();
            return true;
        }
        if (this.Field17702 && this.Field17706) {
            int n4 = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf + this.Field17700 + 4;
            for (int i = 0; i < this.Field17704.length; ++i) {
                if (i != this.Field17705) {
                    if (n3 >= n4 && n3 <= n4 + this.Field17700) {
                        this.Method7673(i);
                        this.Method7677(false);
                        break;
                    }
                    n4 += this.Field17700;
                }
            }
            this.Method7672(n2, n3, b);
            return true;
        }
        return false;
    }
    
    private void Method7673(final int n) {
        if (this.Field17703 != null) {
            this.Field17703.Method4024(n);
        }
        this.Field17705 = n;
    }
    
    public int Method7674() {
        return this.Field17705;
    }
    
    public void Method7675(final int field17705) {
        this.Field17705 = field17705;
    }
    
    public void Method7676(final Class994 field17703) {
        this.Field17703 = field17703;
    }
    
    public void Method7677(final boolean field17706) {
        this.Field17706 = field17706;
        this.Method7671();
    }
    
    static {
        Field17698 = 22;
        Field17697 = 180;
    }
    
    private static String Method7678(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x607E ^ 0xDA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
