//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class357
{
    public long Field9489;
    public double Field9490;
    public double Field9491;
    public double Field9492;
    public boolean Field9493;
    public boolean Field9494;
    public boolean Field9495;
    public long Field9496;
    public long Field9497;
    public double Field9498;
    public long Field9499;
    public boolean Field9500;
    private int Field9501;
    
    public Class357(final long field9489, final double field9490, final double field9491) {
        this.Field9489 = field9489;
        this.Field9490 = field9490;
        this.Field9491 = field9491;
        this.Field9496 = System.currentTimeMillis();
        this.Field9493 = true;
        this.Field9499 = System.currentTimeMillis() - this.Field9496;
        this.Field9498 = (field9491 - field9490) / field9489;
        this.Field9497 = System.currentTimeMillis();
    }
    
    public void Method1792() {
        if (this.Field9493) {
            this.Field9492 += this.Field9498 * (System.currentTimeMillis() - this.Field9497);
        }
        this.Field9497 = System.currentTimeMillis();
    }
    
    public void Method1793(final long field9489) {
        this.Field9489 = field9489;
        this.Field9498 = (this.Field9491 - this.Field9490) / field9489;
        if (this.Field9493) {
            this.Field9492 += this.Field9498 * (System.currentTimeMillis() - this.Field9497);
        }
        this.Field9497 = System.currentTimeMillis();
    }
    
    public void Method1794() {
        this.Field9493 = true;
    }
    
    public void Method1795() {
        this.Field9493 = false;
    }
    
    public double Method1796() {
        return this.Field9490 + this.Field9492;
    }
}
