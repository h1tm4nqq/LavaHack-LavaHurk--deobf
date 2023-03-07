//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 *  net.minecraft.util.EnumActionResult
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.world.World
 *  net.minecraftforge.common.ForgeHooks
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import lavahack.client.GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$1;
import lavahack.client.tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import org.lwjgl.input.Keyboard;

@GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM
public class tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private static final tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12436 = tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9868;
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field12437 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13712).Method5303();
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12438 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 1", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12439 = this.Method23(this.Field12438.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Active", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)791614093 ^ (long)791614092)).Method355("Active")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12440 = this.Method23(this.Field12438.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Field12436)).Method355("Mode"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12441 = this.Method23(this.Field12438.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Key", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)652653847L ^ 0x26E6B517).Method355("Keybind")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12442 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 2", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12443 = this.Method23(this.Field12442.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Active", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1779467369L ^ 0x6A108468) != 0).Method355("Active")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12444 = this.Method23(this.Field12442.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Field12436)).Method355("Mode"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12445 = this.Method23(this.Field12442.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Key", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)-2145753143L ^ 0x801A67C9).Method355("Keybind")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12446 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 3", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12447 = this.Method23(this.Field12446.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Active", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-121406439 ^ (long)-121406440)).Method355("Active")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12448 = this.Method23(this.Field12446.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Field12436)).Method355("Mode"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12449 = this.Method23(this.Field12446.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Key", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)1638684943L ^ 0x61AC590F).Method355("Keybind")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12450 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 4", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12451 = this.Method23(this.Field12450.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Active", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1506103429 ^ (long)-1506103430)).Method355("Active")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12452 = this.Method23(this.Field12450.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Field12436)).Method355("Mode"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12453 = this.Method23(this.Field12450.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Key", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)((long)-1929423851 ^ (long)-1929423851)).Method355("Keybind")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12454 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 5", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12455 = this.Method23(this.Field12454.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Active", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1844921113 ^ (long)1844921112)).Method355("Active")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12456 = this.Method23(this.Field12454.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Field12436)).Method355("Mode"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12457 = this.Method23(this.Field12454.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Key", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)((long)-63493181 ^ (long)-63493181)).Method355("Keybind")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12458 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 6", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12459 = this.Method23(this.Field12458.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Active", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-187402635L ^ 0xF4D47674) != 0).Method355("Active")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12460 = this.Method23(this.Field12458.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Field12436)).Method355("Mode"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12461 = this.Method23(this.Field12458.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Key", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)-55283528L ^ 0xFCB470B8).Method355("Keybind")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12462 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 7", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12463 = this.Method23(this.Field12462.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Active", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1766281251 ^ (long)1766281250)).Method355("Active")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12464 = this.Method23(this.Field12462.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Field12436)).Method355("Mode"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12465 = this.Method23(this.Field12462.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Key", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)-1377700559L ^ 0xADE1F531).Method355("Keybind")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12466 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 8", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12467 = this.Method23(this.Field12466.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Active", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1937608826 ^ (long)-1937608825)).Method355("Active")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12468 = this.Method23(this.Field12466.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Field12436)).Method355("Mode"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12469 = this.Method23(this.Field12466.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Key", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)-979401730L ^ 0xC59F83FE).Method355("Keybind")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12470 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 9", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12471 = this.Method23(this.Field12470.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Active", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-84597658 ^ (long)-84597657)).Method355("Active")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12472 = this.Method23(this.Field12470.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Field12436)).Method355("Mode"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12473 = this.Method23(this.Field12470.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot1Key", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)((long)2004723784 ^ (long)2004723784)).Method355("Keybind")));
    private int Field12474;

    public tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3() {
        super("Octopus", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
    }

    @Override
    public void Method45() {
        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field12439.Method365() && Keyboard.isKeyDown((int)this.Field12441.Method337())) {
            this.Method4140((tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field12440.Method341(), (int)((long)1260628852 ^ (long)1260628853));
        }
        if (this.Field12443.Method365() && Keyboard.isKeyDown((int)this.Field12445.Method337())) {
            this.Method4140((tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field12444.Method341(), (int)((long)-584353128 ^ (long)-584353127) << 1);
        }
        if (this.Field12447.Method365() && Keyboard.isKeyDown((int)this.Field12449.Method337())) {
            this.Method4140((tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field12448.Method341(), (int)-1256604513L ^ 0xB519BC9C);
        }
        if (this.Field12451.Method365() && Keyboard.isKeyDown((int)this.Field12453.Method337())) {
            this.Method4140((tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field12452.Method341(), ((int)497306076L ^ 0x1DA449DD) << 2);
        }
        if (this.Field12455.Method365() && Keyboard.isKeyDown((int)this.Field12457.Method337())) {
            this.Method4140((tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field12456.Method341(), (int)((long)-688835700 ^ (long)-688835703));
        }
        if (this.Field12459.Method365() && Keyboard.isKeyDown((int)this.Field12461.Method337())) {
            this.Method4140((tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field12460.Method341(), ((int)-2041045010L ^ 0x86581FED) << 1);
        }
        if (this.Field12463.Method365() && Keyboard.isKeyDown((int)this.Field12465.Method337())) {
            this.Method4140((tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field12464.Method341(), (int)((long)134075153 ^ (long)134075158));
        }
        if (this.Field12467.Method365() && Keyboard.isKeyDown((int)this.Field12469.Method337())) {
            this.Method4140((tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field12468.Method341(), (int)((long)1518500060 ^ (long)1518500061) << 3);
        }
        if (!this.Field12471.Method365()) return;
        if (!Keyboard.isKeyDown((int)this.Field12473.Method337())) return;
        this.Method4140((tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field12472.Method341(), (int)-229637853L ^ 0xF250012A);
    }

    private void Method4140(tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, int n) {
        int n2 = tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9868) {
            this.Method20();
        } else if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9869) {
            this.Method4141();
        } else {
            this.Method4142();
        }
        if (this.Field12437.Method341() != tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13713) return;
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
    }

    private void Method20() {
        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.leftClickCounter > 0) return;
        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver == null) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error("Null returned as 'hitResult', this shouldn't happen!");
            if (!tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.isNotCreative()) return;
            tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.leftClickCounter = (int)((long)-1531607201 ^ (long)-1531607206) << 1;
            return;
        }
        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRowingBoat()) return;
        switch (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$1.Field8881[tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.typeOfHit.ordinal()]) {
            case 1: {
                tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.attackEntity((EntityPlayer)tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit);
                break;
            }
            case 2: {
                BlockPos blockPos = tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos();
                if (!tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.isAirBlock(blockPos)) {
                    tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.clickBlock(blockPos, tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.sideHit);
                    break;
                }
            }
            case 3: {
                if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.isNotCreative()) {
                    tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.leftClickCounter = ((int)-912258493L ^ 0xC9A00A46) << 1;
                }
                tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.resetCooldown();
                ForgeHooks.onEmptyLeftClick((EntityPlayer)tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                break;
            }
        }
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
    }

    private void Method4141() {
        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.getIsHittingBlock()) return;
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.rightClickDelayTimer = ((int)8682328L ^ 0x847B59) << 2;
        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRowingBoat()) return;
        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver == null) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.warn("Null returned as 'hitResult', this shouldn't happen!");
        }
        EnumHand[] enumHandArray = EnumHand.values();
        int n = enumHandArray.length;
        int n2 = (int)((long)88979833 ^ (long)88979833);
        while (n2 < n) {
            EnumHand enumHand = enumHandArray[n2];
            ItemStack itemStack = tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItem(enumHand);
            if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver != null) {
                switch (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$1.Field8881[tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.typeOfHit.ordinal()]) {
                    case 1: {
                        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.interactWithEntity((EntityPlayer)tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit, tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver, enumHand) == EnumActionResult.SUCCESS) {
                            return;
                        }
                        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.interactWithEntity((EntityPlayer)tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit, enumHand) != EnumActionResult.SUCCESS) break;
                        return;
                    }
                    case 2: {
                        BlockPos blockPos = tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos();
                        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial() == Material.AIR) break;
                        int n3 = itemStack.getCount();
                        EnumActionResult enumActionResult = tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos, tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.sideHit, tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.hitVec, enumHand);
                        if (enumActionResult != EnumActionResult.SUCCESS) break;
                        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(enumHand);
                        if (itemStack.isEmpty()) return;
                        if (itemStack.getCount() == n3) {
                            if (!tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.isInCreativeMode()) return;
                        }
                        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.itemRenderer.resetEquippedProgress(enumHand);
                        return;
                    }
                }
            }
            if (itemStack.isEmpty() && (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver == null || tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.typeOfHit == RayTraceResult.Type.MISS)) {
                ForgeHooks.onEmptyClick((EntityPlayer)tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (EnumHand)enumHand);
            }
            if (!itemStack.isEmpty() && tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClick((EntityPlayer)tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (World)tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, enumHand) == EnumActionResult.SUCCESS) {
                tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.itemRenderer.resetEquippedProgress(enumHand);
                return;
            }
            ++n2;
        }
    }

    private void Method4142() {
        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver == null) return;
        if (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.typeOfHit == RayTraceResult.Type.MISS) return;
        ForgeHooks.onPickBlock((RayTraceResult)tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver, (EntityPlayer)tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (World)tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1733144492 ^ (long)1733144492);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1921460486L ^ 0x728729F9);
            int n2 = ((int)-1184571513L ^ 0xB964DFD4) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1423868617L ^ 0xAB210466 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

