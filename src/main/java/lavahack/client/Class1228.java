//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.google.common.collect.*;

class Class1228 extends AbstractIterator
{
    private Class16 Field13577;
    private int Field13578;
    private int Field13579;
    private int Field13580;
    final Class458 Field13581;
    private String Field13582 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1228(final Class458 field13581) {
        this.Field13581 = field13581;
        this.Field13577 = null;
    }
    
    protected Class16 Method4945() {
        if (this.Field13577 == null) {
            this.Field13578 = this.Field13581.Field9903.getX();
            this.Field13579 = this.Field13581.Field9903.getY();
            this.Field13580 = this.Field13581.Field9903.getZ();
            return this.Field13577 = new Class16(this.Field13578, this.Field13579, this.Field13580);
        }
        if (this.Field13577.equals((Object)this.Field13581.Field9904)) {
            return (Class16)this.endOfData();
        }
        if (this.Field13578 < this.Field13581.Field9904.getX()) {
            ++this.Field13578;
        }
        else if (this.Field13580 < this.Field13581.Field9904.getZ()) {
            this.Field13578 = this.Field13581.Field9903.getX();
            ++this.Field13580;
        }
        else if (this.Field13579 < this.Field13581.Field9904.getY()) {
            this.Field13578 = this.Field13581.Field9903.getX();
            this.Field13580 = this.Field13581.Field9903.getZ();
            ++this.Field13579;
        }
        this.Field13577.Field7895 = this.Field13578;
        this.Field13577.Field7896 = this.Field13579;
        this.Field13577.Field7897 = this.Field13580;
        return this.Field13577;
    }
    
    protected Object Method4946() {
        return this.Method4945();
    }
}
