//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.inventory.Container
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemBucketMilk
 *  net.minecraft.item.ItemEnderPearl
 *  net.minecraft.item.ItemExpBottle
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemPotion
 *  net.minecraft.item.ItemStack
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.NG0k51FfRanQAbgOBpE8PUjB7va0iaQF;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.gIvxvpNAI6XugtMxK19p7peBbgdbr5DL;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemExpBottle;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Mouse;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\"\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0011H\u0002J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0014H\u0002J\u0018\u0010(\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2={"Lcom/kisman/cc/features/module/combat/HandRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "hotbarFirst", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "mainhandLowHPMode", "mainhandLowHPVal", "mainhandMode", "mainhandRightClickMode", "mainhandSlot", "offhandLowHPMode", "offhandLowHPVal", "offhandMode", "offhandRightClickMode", "offhandRightClickNoUsefulItems", "offhandSlot", "", "usageUpdateController", "canBeSwitched", "", "offhand", "right", "lowHP", "doHandRewrite", "", "doSwitch", "findItem", "get", "Lnet/minecraft/item/ItemStack;", "slot", "getItem", "Lnet/minecraft/item/Item;", "itemCheck", "switch", "slotOfItem", "slotToSwitch", "Lcom/kisman/cc/util/enums/HandRewriteSlotMappings;", "update", "usefulItemsCheck", "windowClick", "Modes", "kisman.cc"})
public final class adxKLRUfKrz15cz62FrIMLBHho9GUWzV
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15329 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mainhand Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16825));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15330 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mainhand Slot", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble((long)1819707370 ^ 0x402200006C7687EAL), ((int)1864626425L ^ 0x6F23F0F8) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15331 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mainhand Right Click Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16825));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15332 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mainhand Low HP Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16825));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15333 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mainhand Low HP Val", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x5F177037BB809994L ^ 0x1F337037BB809994L), 1.0, Double.longBitsToDouble(0x7DFDDB65AF66D9DEL ^ 0x3DBFDB65AF66D9DEL), (boolean)((long)1714358284 ^ (long)1714358285)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15334 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offhand Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16825));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15335 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offhand Right Click Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16825));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15336 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offhand Right Click No Useful Items", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1466962366 ^ (long)1466962367)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15337 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offhand Low HP Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16825));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15338 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offhand Low HP Val", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x95149CA900C97A91L ^ 0xD5309CA900C97A91L), 1.0, Double.longBitsToDouble((long)111834406 ^ 0x4042000006AA7526L), ((int)-451724368L ^ 0xE5133BB1) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15339 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Usage UpdateController", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1213078258L ^ 0xB7B1E50F) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15340 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hotbar First", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)480402301L ^ 0x1CA25B7D) != 0));
    private final int Field15341 = (int)((long)-1148501304 ^ (long)-1148501275);
    private int Field15342;

    /*
     * Unable to fully structure code
     */
    @Override
    public void Method45() {
        block7: {
            if (adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player == null) return;
            if (adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().world == null) return;
            if (adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().playerController == null) {
                return;
            }
            v0 = this.Field15329;
            Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"mainhandMode");
            if (v0.Method341() == adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16825 || !this.Method6201((boolean)((long)5985963 ^ (long)5985963), (boolean)((long)466480237 ^ (long)466480237), (boolean)((int)553944271L ^ 553944271))) break block7;
            v1 = (int)((long)1427777377 ^ (long)1427777377);
            v2 = Mouse.isButtonDown((int)((int)745847165L ^ 745847164)) != false && adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().currentScreen == null && this.Method6201((boolean)((long)1553851272 ^ (long)1553851272), (boolean)((long)275737035 ^ (long)275737034), (boolean)((int)940635777L ^ 940635777)) != false ? (int)((long)821158188 ^ (long)821158189) : (int)1113481516L ^ 1113481516;
            v3 = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"mc.player");
            v4 = v3.getHealth() + adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player.absorptionAmount;
            v5 = this.Field15333;
            Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"mainhandLowHPVal");
            if (!(v4 < (float)v5.Method335())) ** GOTO lbl-1000
            v6 = this.Field15332;
            Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"mainhandLowHPMode");
            if (v6.Method341() != adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16825 && this.Method6201((boolean)((long)-1622295983 ^ (long)-1622295983), (boolean)((long)-1640342508 ^ (long)-1640342508), (boolean)((long)-1726693800 ^ (long)-1726693799))) {
                v7 = (int)((long)1984986723 ^ (long)1984986722);
            } else lbl-1000:
            // 2 sources

            {
                v7 = (int)((long)609545108 ^ (long)609545108);
            }
            this.Method6202((boolean)v1, (boolean)v2, (boolean)v7);
        }
        v8 = this.Field15334;
        Intrinsics.checkExpressionValueIsNotNull((Object)v8, (String)"offhandMode");
        if (v8.Method341() == adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16825) return;
        if (this.Method6201((boolean)((int)-761090773L ^ -761090774), (boolean)((int)613981827L ^ 613981827), (boolean)((long)318768059 ^ (long)318768059)) == false) return;
        v9 = (int)((long)-285393487 ^ (long)-285393488);
        if (!Mouse.isButtonDown((int)((int)((long)-215273142 ^ (long)-215273141))) || adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().currentScreen != null) ** GOTO lbl-1000
        v10 = this.Field15336;
        Intrinsics.checkExpressionValueIsNotNull((Object)v10, (String)"offhandRightClickNoUsefulItems");
        if (!(v10.Method365() && this.Method27() || !this.Method6201((boolean)((long)-417950222 ^ (long)-417950221), (boolean)((int)1034546392L ^ 1034546393), (boolean)((int)-49568309L ^ -49568309)))) {
            v11 = (int)((long)-1756947109 ^ (long)-1756947110);
        } else lbl-1000:
        // 2 sources

        {
            v11 = (int)((long)-51666236 ^ (long)-51666236);
        }
        v12 = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)v12, (String)"mc.player");
        v13 = v12.getHealth() + adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player.absorptionAmount;
        v14 = this.Field15338;
        Intrinsics.checkExpressionValueIsNotNull((Object)v14, (String)"offhandLowHPVal");
        if (!(v13 < (float)v14.Method335())) ** GOTO lbl-1000
        v15 = this.Field15337;
        Intrinsics.checkExpressionValueIsNotNull((Object)v15, (String)"offhandLowHPMode");
        if (v15.Method341() != adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16825 && this.Method6201((boolean)((int)1661498632L ^ 1661498633), (boolean)((int)1063220848L ^ 1063220848), (boolean)((int)607449293L ^ 607449292))) {
            v16 = (int)-1165682171L ^ -1165682172;
        } else lbl-1000:
        // 2 sources

        {
            v16 = (int)((long)-955802395 ^ (long)-955802395);
        }
        this.Method6202((boolean)v9, (boolean)v11, (boolean)v16);
    }

    private final boolean Method6201(boolean bl, boolean bl2, boolean bl3) {
        int n;
        if (this.Method6204(bl, bl2, bl3) != ((int)-1343567881L ^ 0x50153808)) {
            n = (int)((long)-817745914 ^ (long)-817745913);
            return n != 0;
        }
        n = (int)((long)-83536472 ^ (long)-83536472);
        return n != 0;
    }

    private final boolean Method27() {
        int n;
        EntityPlayerSP entityPlayerSP = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!(entityPlayerSP.getHeldItemMainhand().item instanceof ItemFood)) {
            EntityPlayerSP entityPlayerSP2 = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            if (!(entityPlayerSP2.getHeldItemMainhand().item instanceof ItemPotion)) {
                EntityPlayerSP entityPlayerSP3 = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
                if (!(entityPlayerSP3.getHeldItemMainhand().item instanceof ItemBucketMilk)) {
                    EntityPlayerSP entityPlayerSP4 = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
                    if (!(entityPlayerSP4.getHeldItemMainhand().item instanceof ItemExpBottle)) {
                        EntityPlayerSP entityPlayerSP5 = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP5, (String)"mc.player");
                        if (!(entityPlayerSP5.getHeldItemMainhand().item instanceof ItemBow)) {
                            EntityPlayerSP entityPlayerSP6 = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player;
                            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP6, (String)"mc.player");
                            if (!(entityPlayerSP6.getHeldItemMainhand().item instanceof ItemEnderPearl)) {
                                n = (int)((long)-122075256 ^ (long)-122075256);
                                return n != 0;
                            }
                        }
                    }
                }
            }
        }
        n = (int)1073572416L ^ 0x3FFD6A41;
        return n != 0;
    }

    private final void Method6202(boolean bl, boolean bl2, boolean bl3) {
        if (!this.Method6206(bl, bl2, bl3)) return;
        this.Method6205(bl, bl2, bl3);
    }

    private final Item Method6203(boolean bl, boolean bl2, boolean bl3) {
        Enum enum_;
        Item item;
        if (bl) {
            Enum enum_2;
            if (bl2) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field15335;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"offhandRightClickMode");
                enum_2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
            } else if (bl3) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field15337;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"offhandLowHPMode");
                enum_2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341();
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field15334;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"offhandMode");
                enum_2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method341();
            }
            if (enum_2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.combat.HandRewrite.Modes");
            }
            item = ((adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)enum_2).Method7099();
            return item;
        }
        if (bl2) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field15331;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"mainhandRightClickMode");
            enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method341();
        } else if (bl3) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field15332;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"mainhandLowHPMode");
            enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method341();
        } else {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field15329;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"mainhandMode");
            enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method341();
        }
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.combat.HandRewrite.Modes");
        }
        item = ((adxKLRUfKrz15cz62FrIMLBHho9GUWzV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)enum_).Method7099();
        return item;
    }

    private final int Method6204(boolean bl, boolean bl2, boolean bl3) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field15340;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"hotbarFirst");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            Container container = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player.inventoryContainer;
            Intrinsics.checkExpressionValueIsNotNull((Object)container, (String)"mc.player.inventoryContainer");
            int n = container.getInventory().size() - (int)((long)-1855984997 ^ (long)-1855984998);
            int n2 = (int)((long)-487783960 ^ (long)-487783959);
            while (n >= n2) {
                if (n != ((int)514037259L ^ 0x1EA3960E) && n != ((int)1482097141L ^ 0x585701F6) << 1 && n != (int)((long)-871370861 ^ (long)-871370860) && n != (int)((long)415090967 ^ (long)415090966) << 3) {
                    Container container2 = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player.inventoryContainer;
                    Intrinsics.checkExpressionValueIsNotNull((Object)container2, (String)"mc.player.inventoryContainer");
                    Object object = container2.getInventory().get(n);
                    Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"mc.player.inventoryContainer.inventory[i]");
                    ItemStack itemStack = (ItemStack)object;
                    if (!itemStack.isEmpty && Intrinsics.areEqual((Object)itemStack.item, (Object)this.Method6203(bl, bl2, bl3))) {
                        return n;
                    }
                }
                --n;
            }
            return (int)-797588772L ^ 0x2F8A3D23;
        }
        int n = (int)((long)-943314834 ^ (long)-943314834);
        Container container = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player.inventoryContainer;
        Intrinsics.checkExpressionValueIsNotNull((Object)container, (String)"mc.player.inventoryContainer");
        int n3 = container.getInventory().size();
        while (n < n3) {
            int cfr_ignored_0 = (int)1330508607L ^ 0x4F4DF33A;
            int cfr_ignored_1 = ((int)-65461939L ^ 0xFC19214E) << 1;
            int cfr_ignored_2 = (int)((long)2292782 ^ (long)2292777);
            int cfr_ignored_3 = ((int)1233512915L ^ 0x4985E9D2) << 3;
            Container container3 = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player.inventoryContainer;
            Intrinsics.checkExpressionValueIsNotNull((Object)container3, (String)"mc.player.inventoryContainer");
            Object object = container3.getInventory().get(n);
            Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"mc.player.inventoryContainer.inventory[i]");
            ItemStack itemStack = (ItemStack)object;
            if (!itemStack.isEmpty && Intrinsics.areEqual((Object)itemStack.item, (Object)this.Method6203(bl, bl2, bl3))) {
                return n;
            }
            ++n;
        }
        return (int)-797588772L ^ 0x2F8A3D23;
    }

    private final void Method6205(boolean bl, boolean bl2, boolean bl3) {
        String string;
        if (bl) {
            this.Method6208(this.Method6204(bl, bl2, bl3));
        } else {
            int n = this.Method6204(bl, bl2, bl3);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field15330;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"mainhandSlot");
            this.Method6209(n, NG0k51FfRanQAbgOBpE8PUjB7va0iaQF.Field12661.Method7454(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335()));
        }
        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505();
        StringBuilder stringBuilder = new StringBuilder().append(bl ? "Offhand" : " Mainhand").append(" now has a ");
        if (bl) {
            if (bl3) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field15337;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"offhandLowHPMode");
                string = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341().name();
            } else if (bl2) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field15335;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"offhandRightClickMode");
                string = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method341().name();
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field15334;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"offhandMode");
                string = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method341().name();
            }
        } else if (bl3) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field15332;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"mainhandLowHPMode");
            string = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method341().name();
        } else if (bl2) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field15331;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"mainhandRightClickMode");
            string = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method341().name();
        } else {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Field15329;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"mainhandMode");
            string = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method341().name();
        }
        gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2.Method1886(stringBuilder.append(string).toString());
    }

    private final boolean Method6206(boolean bl, boolean bl2, boolean bl3) {
        Item item;
        if (bl) {
            EntityPlayerSP entityPlayerSP = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            item = entityPlayerSP.getHeldItemMainhand().item;
            return Intrinsics.areEqual((Object)item, (Object)this.Method6203(bl, bl2, bl3)) ^ (int)((long)1975197185 ^ (long)1975197184);
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field15330;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"mainhandSlot");
        item = this.Method6207((int)NG0k51FfRanQAbgOBpE8PUjB7va0iaQF.Field12661.Method7454((int)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335()).Method4290()).item;
        return (Intrinsics.areEqual((Object)item, (Object)this.Method6203(bl, bl2, bl3)) ^ (int)((long)1975197185 ^ (long)1975197184)) != 0;
    }

    private final ItemStack Method6207(int n) {
        Container container = adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player.inventoryContainer;
        Intrinsics.checkExpressionValueIsNotNull((Object)container, (String)"mc.player.inventoryContainer");
        Object object = container.getInventory().get(n);
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"mc.player.inventoryContainer.inventory[slot]");
        return (ItemStack)object;
    }

    private final void Method6208(int n) {
        this.Method6210(n, ((int)721638061L ^ 0x2B0352AD) != 0);
        this.Method6210(n, ((int)1341907699L ^ 0x4FFBE2F2) != 0);
        this.Method6210(n, (boolean)((long)-1968785328 ^ (long)-1968785328));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field15339;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"usageUpdateController");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().playerController.updateController();
    }

    private final void Method6209(int n, NG0k51FfRanQAbgOBpE8PUjB7va0iaQF nG0k51FfRanQAbgOBpE8PUjB7va0iaQF) {
        this.Method6210(n, ((int)-966582940L ^ 0xC6631D64) != 0);
        this.Method6210(nG0k51FfRanQAbgOBpE8PUjB7va0iaQF.Method4290(), (boolean)((long)-729464516 ^ (long)-729464516));
        this.Method6210(n, (boolean)((long)265545945 ^ (long)265545945));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field15339;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"usageUpdateController");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().playerController.updateController();
    }

    private final void Method6210(int n, boolean bl) {
        adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().playerController.windowClick(adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player.inventoryContainer.windowId, bl ? this.Field15341 : n, (int)1019374802L ^ 0x3CC26CD2, ClickType.PICKUP, (EntityPlayer)adxKLRUfKrz15cz62FrIMLBHho9GUWzV.Method6211().player);
    }

    public adxKLRUfKrz15cz62FrIMLBHho9GUWzV() {
        super("HandRewrite", "Need to update btw, dont use mainhand feature", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
    }

    public static final Minecraft Method6211() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method6212(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)125764246L ^ 0x77F0296;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-945989990 ^ (long)-945990043);
            int n2 = (int)1823620232L ^ 0x6CB23C65;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)92186945 ^ (long)92187022) << 6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

