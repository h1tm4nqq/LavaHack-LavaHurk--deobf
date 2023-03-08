//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.google.common.collect.*;

class Class1827 extends AbstractIterator
{
    private Class16 Field16435;
    private int Field16436;
    private int Field16437;
    private int Field16438;
    final Class456 Field16439;
    private String Field16440 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1827(final Class456 field16439) {
        this.Field16439 = field16439;
        this.Field16435 = null;
    }
    
    protected Class16 Method6881() {
        if (this.Field16435 == null) {
            this.Field16436 = this.Field16439.Field9897.getX();
            this.Field16437 = this.Field16439.Field9897.getY();
            this.Field16438 = this.Field16439.Field9897.getZ();
            return this.Field16435 = new Class16(this.Field16436, this.Field16437, this.Field16438);
        }
        if (this.Field16435.equals((Object)this.Field16439.Field9898)) {
            return (Class16)this.endOfData();
        }
        if (this.Field16436 < this.Field16439.Field9898.getX()) {
            ++this.Field16436;
        }
        else if (this.Field16437 < this.Field16439.Field9898.getY()) {
            this.Field16436 = this.Field16439.Field9897.getX();
            ++this.Field16437;
        }
        else if (this.Field16438 < this.Field16439.Field9898.getZ()) {
            this.Field16436 = this.Field16439.Field9897.getX();
            this.Field16437 = this.Field16439.Field9897.getY();
            ++this.Field16438;
        }
        this.Field16435.Field7895 = this.Field16436;
        this.Field16435.Field7896 = this.Field16437;
        this.Field16435.Field7897 = this.Field16438;
        return this.Field16435;
    }
    
    protected Object Method6882() {
        return this.Method6881();
    }
}
