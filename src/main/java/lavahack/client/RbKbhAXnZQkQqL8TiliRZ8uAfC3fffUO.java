//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.ranges.RangesKt
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import lavahack.client.GT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8;
import lavahack.client.Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0;
import lavahack.client.UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq;
import lavahack.client.a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002JF\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aJ\u001a\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002JX\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\b2\u0006\u0010\"\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0002J\u0006\u0010-\u001a\u00020\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0006j\b\u0012\u0004\u0012\u00020\f`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2={"Lcom/kisman/cc/settings/util/CharmsRewriteRendererPattern;", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "groups", "Ljava/util/ArrayList;", "Lcom/kisman/cc/settings/types/SettingGroup;", "Lkotlin/collections/ArrayList;", "getModule", "()Lcom/kisman/cc/features/module/Module;", "settings", "Lcom/kisman/cc/settings/CharmsRewriteSetting;", "doOptions", "", "entity", "Lnet/minecraft/entity/Entity;", "end", "", "mode", "Lcom/kisman/cc/util/enums/CharmsRewriteTypeModes;", "exclude", "doRender", "model", "Lnet/minecraft/client/model/ModelBase;", "limbSwing", "", "limbSwingAmount", "ageInTicks", "netHeadYaw", "headPitch", "scale", "getSettingByType", "Lcom/kisman/cc/settings/Setting;", "type", "Lcom/kisman/cc/util/enums/CharmsRewriteTypes;", "getSettingsByType", "Lcom/kisman/cc/util/enums/CharmsRewriteEntityTypes;", "group", "wireGroup", "modelGroup", "wireColorGroup", "modelColorGroup", "wireCrowdAlphaGroup", "modelCrowdAlphaGroup", "init", "kisman.cc"})
public final class RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO {
    private final ArrayList Field13376;
    private final ArrayList Field13377;
    @NotNull
    private final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Field13378;
    private String Field13379 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO Method4772() {
        for (Object object : this.Field13377) {
            this.Field13378.Method23(((bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O)object).Method6219());
        }
        Iterator iterator = this.Field13376.iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl)iterator.next();
            this.Field13378.Method24((xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl)object);
        }
        return this;
    }

    private final ArrayList Method4773(GT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8 gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl5, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl6, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl7, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl8) {
        a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        int n;
        ArrayList<bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O> arrayList = new ArrayList<bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O>();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Mode", this.Field13378, Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq.Field9797).Method355("Mode");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"${type.name} Mo\u2026es.None).setTitle(\"Mode\")");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2);
        arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8648));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Width", this.Field13378, 1.0, Double.longBitsToDouble((long)2116074244 ^ 0x3FB99999E7B9229EL), Double.longBitsToDouble(0xE754D414D501DB31L ^ 0xA740D414D501DB31L), ((int)-1956633862L ^ 0x8B6022FA) != 0).Method355("Width");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"${type.name} Wi\u2026 false).setTitle(\"Width\")");
        arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8649));
        a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.values();
        int n2 = a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray.length;
        for (n = (int)-1215811341L ^ 0xB78830F3; n < n2; ++n) {
            a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n];
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Wire " + a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.name(), this.Field13378, ((int)-811219693L ^ 0xCFA5C513) != 0).Method355(a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.name());
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"Setting(\"${type.name} Wi\u2026se).setTitle(option.name)");
            arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1811(), a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi));
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Wire Crowd Alpha", this.Field13378, 1.0, Double.longBitsToDouble(0x5BCDD97E3BEEE7F6L ^ 0x647440E7A2777E6CL), 1.0, ((int)1473873091L ^ 0x57D984C3) != 0).Method355("Alpha");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"Setting(\"${type.name} Wi\u2026 false).setTitle(\"Alpha\")");
        arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl7.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8657));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Wire Crowd Alpha Range", this.Field13378, Double.longBitsToDouble(0x344DBE31464F5E59L ^ 0x7469BE31464F5E59L), 1.0, Double.longBitsToDouble(0x3A8A95328477CB78L ^ 0x7ABE95328477CB78L), ((int)1454388345L ^ 0x56B03479) != 0).Method355("Range");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"Setting(\"${type.name} Wi\u2026 false).setTitle(\"Range\")");
        arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl7.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8658));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Wire Custom Color", this.Field13378, (boolean)((long)1414352295 ^ (long)1414352295)).Method355("Custom");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"Setting(\"${type.name} Wi\u2026false).setTitle(\"Custom\")");
        arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl5.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8659));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Wire Color", this.Field13378, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-378391480L ^ 0xE97234B7, (int)((long)-588745574 ^ (long)-588745627), (int)-1325352090L ^ 0xB100BB99, (int)50915954L ^ 0x308EA8D)).Method355("Custom");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"Setting(\"${type.name} Wi\u2026 255)).setTitle(\"Custom\")");
        arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl5.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8660));
        if (gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8 == GT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.Field10328) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Wire Friend Color", this.Field13378, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Color.CYAN)).Method355("Friend");
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"Setting(\"${type.name} Wi\u2026CYAN)).setTitle(\"Friend\")");
            arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl5.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8661));
        }
        a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.values();
        n2 = a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray.length;
        for (n = (int)((long)-936014378 ^ (long)-936014378); n < n2; ++n) {
            a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n];
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Model " + a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.name(), this.Field13378, (boolean)((long)717698055 ^ (long)717698055)).Method355(a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.name());
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"Setting(\"${type.name} Mo\u2026se).setTitle(option.name)");
            arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1812(), a9PYGIjInk30FCZMc4guCckFx9sykjkK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi));
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Model Crowd Alpha", this.Field13378, 1.0, Double.longBitsToDouble((long)1177111509 ^ 0x3FB99999DFB0D24FL), 1.0, ((int)1427092474L ^ 0x550FB3FA) != 0).Method355("Crowd Alpha");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12, (String)"Setting(\"${type.name} Mo\u2026).setTitle(\"Crowd Alpha\")");
        arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl8.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8668));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Model Crowd Alpha Range", this.Field13378, Double.longBitsToDouble(0xD8BD3416EF1C2447L ^ 0x98993416EF1C2447L), 1.0, Double.longBitsToDouble((long)1371738312 ^ 0x4034000051C310C8L), ((int)489660867L ^ 0x1D2FA1C3) != 0).Method355("Range");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13, (String)"Setting(\"${type.name} Mo\u2026 false).setTitle(\"Range\")");
        arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl8.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8669));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Model Custom Color", this.Field13378, (boolean)((long)-692515847 ^ (long)-692515847)).Method355("Custom");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14, (String)"Setting(\"${type.name} Mo\u2026false).setTitle(\"Custom\")");
        arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl6.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8670));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Model Color", this.Field13378, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)493300096 ^ (long)493300095), (int)((long)1329622575 ^ (long)1329622736), (int)((long)-301312094 ^ (long)-301312163), (int)((long)296758012 ^ (long)296757763))).Method355("Custom");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15, (String)"Setting(\"${type.name} Mo\u2026 255)).setTitle(\"Custom\")");
        arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl6.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8671));
        if (gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8 == GT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.Field10328) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " Model Friend Color", this.Field13378, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Color.CYAN)).Method355("Friend");
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16, (String)"Setting(\"${type.name} Mo\u2026CYAN)).setTitle(\"Friend\")");
            arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl6.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8672));
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD17 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name() + " No Hurt", this.Field13378, ((int)-153690041L ^ 0xF6D6E047) != 0).Method355("No Hurt");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD17, (String)"Setting(\"${type.name} No\u2026alse).setTitle(\"No Hurt\")");
        arrayList.add(new bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD17), gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8650));
        return arrayList;
    }

    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4774(UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp uAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp, Entity entity) {
        bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O2;
        Iterator iterator = this.Field13377.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O2 = (bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O)iterator.next()).Method6220() != GT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.Field10334.Method4123(entity) || bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O2.Method6221() != uAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp);
        return bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O2.Method6219();
    }

    public final void Method4775(@NotNull @NotNull Entity entity, @NotNull @NotNull ModelBase modelBase, float f, float f2, float f3, float f4, float f5, float f6) {
        block11: {
            block10: {
                Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
                Intrinsics.checkParameterIsNotNull((Object)modelBase, (String)"model");
                if (GT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.Field10334.Method4123(entity) == null) break block10;
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Method4774(UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8648, entity);
                if ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 != null ? qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341() : null) != Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq.Field9797) break block11;
            }
            modelBase.render(entity, f, f2, f3, f4, f5, f6);
            return;
        }
        if (entity instanceof EntityLivingBase) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Method4774(UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8650, entity);
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 != null && qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365() == ((int)-1723328928L ^ 0x99481661)) {
                ((EntityLivingBase)entity).hurtTime = (int)((long)919921517 ^ (long)919921517);
            }
        }
        GL11.glPushMatrix();
        GL11.glPushAttrib((int)((int)((long)1139831071 ^ (long)1140821728)));
        Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 = Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0.Field9168;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Method4774(UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8648, entity);
        if ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 != null ? qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method341() : null) == Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq.Field9799) {
            odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 = Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0.Field9167;
        }
        this.Method4776(entity, ((int)-1315977392L ^ 0xB18FC750) != 0, odxkrip4zUej3nYA3AyBMPPGaVbfhZp0, ((int)-619336083L ^ 0xDB15AE6D) != 0);
        if (odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 == Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0.Field9167) {
            GL11.glPolygonMode((int)(((int)-1910195127L ^ 0x8E24BCC8) << 3), (int)((int)734621900L ^ 0x2BC96BCD));
        }
        GL11.glEnable((int)((int)((long)-1737237868 ^ (long)-1737237811) << 5));
        GL11.glHint((int)((int)((long)-657099329 ^ (long)-657099882) << 1), (int)(((int)785437280L ^ 0x2ED0DAE1) << 1));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Method4774(UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8649, entity);
        Float f7 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 != null ? Float.valueOf(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method368()) : null;
        if (f7 == null) {
            Intrinsics.throwNpe();
        }
        GL11.glLineWidth((float)f7.floatValue());
        modelBase.render(entity, f, f2, f3, f4, f5, f6);
        this.Method4776(entity, (boolean)((long)1784388271 ^ (long)1784388270), odxkrip4zUej3nYA3AyBMPPGaVbfhZp0, ((int)815750447L ^ 0x309F5D2F) != 0);
        Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 odxkrip4zUej3nYA3AyBMPPGaVbfhZp02 = Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0.Field9168;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Method4774(UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8648, entity);
        if ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 != null ? qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method341() : null) == Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq.Field9800) {
            odxkrip4zUej3nYA3AyBMPPGaVbfhZp02 = Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0.Field9167;
        }
        this.Method4776(entity, ((int)1584951892L ^ 0x5E787254) != 0, odxkrip4zUej3nYA3AyBMPPGaVbfhZp02, (boolean)((long)1715656837 ^ (long)1715656837));
        if (odxkrip4zUej3nYA3AyBMPPGaVbfhZp02 == Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0.Field9167) {
            GL11.glPolygonMode((int)(((int)1111642751L ^ 0x424252FE) << 3), (int)((int)((long)1632722739 ^ (long)1632715826)));
        }
        modelBase.render(entity, f, f2, f3, f4, f5, f6);
        this.Method4776(entity, (boolean)((long)693396428 ^ (long)693396429), odxkrip4zUej3nYA3AyBMPPGaVbfhZp02, ((int)-1746484233L ^ 0x97E6C3F7) != 0);
        GL11.glPopAttrib();
        GL11.glPopMatrix();
    }

    private final void Method4776(Entity entity, boolean bl, Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 odxkrip4zUej3nYA3AyBMPPGaVbfhZp0, boolean bl2) {
        double d;
        double d2;
        for (bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O2 : this.Field13377) {
            int n;
            if (bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O2.Method6222() == null) continue;
            if (bl2) {
                if (bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O2.Method6221().Method1055() != odxkrip4zUej3nYA3AyBMPPGaVbfhZp0) {
                    n = (int)1073647821L ^ 0x3FFE90CC;
                    continue;
                }
                n = (int)((long)487445224 ^ (long)487445224);
                continue;
            }
            if (bjipKPiJHHAGRmSIHIAczNHDJY0Pkg3O2.Method6221().Method1055() == odxkrip4zUej3nYA3AyBMPPGaVbfhZp0) {
                n = (int)104069695L ^ 0x633FA3E;
                continue;
            }
            n = (int)-622189923L ^ 0xDAEA229D;
        }
        if (bl) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Method4774(odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 == Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0.Field9167 ? UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8659 : UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8670, entity);
        Boolean bl3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 != null ? Boolean.valueOf(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) : null;
        if (bl3 == null) {
            Intrinsics.throwNpe();
        }
        if (bl3 == false) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Method4774(odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 == Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0.Field9167 ? UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8657 : UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8668, entity);
        Double d3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 != null ? Double.valueOf(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method367()) : null;
        if (d3 == null) {
            Intrinsics.throwNpe();
        }
        if (d3 != 1.0) {
            double d4 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getDistanceSq(entity);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Method4774(odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 == Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0.Field9167 ? UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8658 : UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8669, entity);
            Double d5 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 != null ? Double.valueOf(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method367()) : null;
            if (d5 == null) {
                Intrinsics.throwNpe();
            }
            d2 = d4 / d5;
        } else {
            d2 = d = 1.0;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Method4774(odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 == Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0.Field9167 ? (entity instanceof EntityPlayer && n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3042((EntityPlayer)entity) ? UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8661 : UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8660) : (entity instanceof EntityPlayer && n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3042((EntityPlayer)entity) ? UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8672 : UAo5ZGeXfsGn5huJ8j9wEh8Ldt3NzXrp.Field8671), entity);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3714(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 != null ? qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method339() : null);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 == null) return;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
        int n = (int)((long)777437796 ^ (long)777437796);
        int n2 = (int)((long)-1405901118 ^ (long)-1405901118);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        int n3 = (int)((long)-504282209 ^ (long)-504282209);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5.Method3613(RangesKt.coerceIn((int)((int)((double)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5.Method3631() * d)), (int)((int)1810057370L ^ 0x6BE3489A), (int)((int)1886552682L ^ 0x70728295)));
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6;
        if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6 == null) return;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3632();
    }

    @NotNull
    @NotNull
    public final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Method4777() {
        return this.Field13378;
    }

    public RbKbhAXnZQkQqL8TiliRZ8uAfC3fffUO(@NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        this.Field13378 = wjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
        this.Field13376 = new ArrayList();
        this.Field13377 = new ArrayList();
        GT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8[] gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8Array = GT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.values();
        int n = gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8Array.length;
        int n2 = (int)2090873414L ^ 0x7CA03246;
        while (n2 < n) {
            GT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8 gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8 = gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8Array[n2];
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8.name(), this.Field13378));
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Wire", this.Field13378)));
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Model", this.Field13378)));
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl5 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", this.Field13378)));
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl6 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", this.Field13378)));
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl7 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Crowd", this.Field13378)));
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl8 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Crowd", this.Field13378)));
            this.Field13376.add(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2);
            this.Field13376.add(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3);
            this.Field13376.add(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4);
            this.Field13377.addAll(this.Method4773(gT4VSMfcgSw6eOCykWZkqGRUp1KIwpI8, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl5, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl6, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl7, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl8));
            ++n2;
        }
    }

    private static String Method4778(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1761723721L ^ 0x6901C549;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1734975995L ^ 0x6769A104);
            int n2 = (int)((long)1571626516 ^ (long)1571626507);
            cArray2[n] = (char)(cArray[n] ^ ((int)-481402516L ^ 0xE34E30F1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

