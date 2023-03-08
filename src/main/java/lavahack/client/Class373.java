//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.settings.*;
import net.minecraft.client.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.client.gui.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.math.*;
import net.minecraftforge.common.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.client.settings.*;

public class Class373
{
    public static final Class373 Field9563;
    private static final KeyBinding Field9564;
    private static final KeyBinding Field9565;
    private static final KeyBinding Field9566;
    private static final KeyBinding Field9567;
    private static final KeyBinding Field9568;
    private static final KeyBinding Field9569;
    private static final KeyBinding Field9570;
    private static final KeyBinding Field9571;
    private static final KeyBinding Field9572;
    public static final KeyBinding[] Field9573;
    private final Minecraft Field9574;
    private String Field9575 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class373() {
        this.Field9574 = Minecraft.getMinecraft();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1824(final InputEvent inputEvent) {
        if (this.Field9574.currentScreen == null) {
            if (Class373.Field9564.isPressed()) {
                this.Field9574.displayGuiScreen((GuiScreen)new Class483(this.Field9574.currentScreen));
            }
            if (Class373.Field9565.isPressed()) {
                this.Field9574.displayGuiScreen((GuiScreen)new Class1434(this.Field9574.currentScreen));
            }
            if (Class373.Field9566.isPressed()) {
                this.Field9574.displayGuiScreen((GuiScreen)new Class992(this.Field9574.currentScreen));
            }
            if (Class373.Field9567.isPressed()) {
                final Class1479 field8122 = Class46.Field8122;
                if (field8122 != null && field8122.Field14898 != Class617.Field10633) {
                    field8122.Field14899 = MathHelper.clamp(field8122.Field14899 + 1, 0, field8122.getHeight() - 1);
                    Class934.Field11944.refresh();
                }
            }
            if (Class373.Field9568.isPressed()) {
                final Class1479 field8123 = Class46.Field8122;
                if (field8123 != null && field8123.Field14898 != Class617.Field10633) {
                    field8123.Field14899 = MathHelper.clamp(field8123.Field14899 - 1, 0, field8123.getHeight() - 1);
                    Class934.Field11944.refresh();
                }
            }
            if (Class373.Field9569.isPressed()) {
                final Class1479 field8124 = Class46.Field8122;
                if (field8124 != null) {
                    field8124.Field14898 = Class617.Method1105(field8124.Field14898);
                    Class934.Field11944.refresh();
                }
            }
            if (Class373.Field9570.isPressed()) {
                final Class1479 field8125 = Class46.Field8122;
                if (field8125 != null) {
                    field8125.Field14897 = !field8125.Field14897;
                    Class934.Field11944.refresh();
                }
            }
            if (Class373.Field9571.isPressed()) {
                final Class1479 field8126 = Class46.Field8122;
                if (field8126 != null) {
                    Class46.Method425(field8126);
                    Class934.Field11944.refresh();
                }
            }
            if (Class373.Field9572.isPressed()) {
                final Class1479 field8127 = Class46.Field8122;
                if (field8127 != null && field8127.Field14897) {
                    this.Method1825(field8127, Class46.Field8129);
                }
            }
        }
    }
    
    private boolean Method1825(final Class1479 class1479, final RayTraceResult rayTraceResult) {
        if (rayTraceResult == null) {
            return false;
        }
        if (rayTraceResult.typeOfHit == RayTraceResult$Type.MISS) {
            return false;
        }
        final EntityPlayerSP player = this.Field9574.player;
        if (!ForgeHooks.onPickBlock(rayTraceResult, (EntityPlayer)player, (World)class1479)) {
            return true;
        }
        if (player.capabilities.isCreativeMode) {
            this.Field9574.playerController.sendSlotPacket(player.inventory.getStackInSlot(player.inventory.currentItem), player.inventoryContainer.inventorySlots.size() - 10 + player.inventory.currentItem);
            return true;
        }
        return false;
    }
    
    static {
        Field9563 = new Class373();
        Field9564 = new KeyBinding("schematica.key.load", 181, "schematica.key.category");
        Field9565 = new KeyBinding("schematica.key.save", 55, "schematica.key.category");
        Field9566 = new KeyBinding("schematica.key.control", 74, "schematica.key.category");
        Field9567 = new KeyBinding("schematica.key.layerInc", 0, "schematica.key.category");
        Field9568 = new KeyBinding("schematica.key.layerDec", 0, "schematica.key.category");
        Field9569 = new KeyBinding("schematica.key.layerToggle", 0, "schematica.key.category");
        Field9570 = new KeyBinding("schematica.key.renderToggle", 0, "schematica.key.category");
        Field9571 = new KeyBinding("schematica.key.moveHere", 0, "schematica.key.category");
        Field9572 = new KeyBinding("schematica.key.pickBlock", (IKeyConflictContext)KeyConflictContext.IN_GAME, KeyModifier.SHIFT, -98, "schematica.key.category");
        Field9573 = new KeyBinding[] { Class373.Field9564, Class373.Field9565, Class373.Field9566, Class373.Field9567, Class373.Field9568, Class373.Field9569, Class373.Field9570, Class373.Field9571, Class373.Field9572 };
    }
    
    private static String Method1826(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1042 ^ 0x9F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
