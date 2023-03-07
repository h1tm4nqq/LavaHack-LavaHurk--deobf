//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.B0T8OZ4NrpjDH06oaTzUnOqmIlCrw3Uh;
import lavahack.client.Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n\u001a\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n\u001a\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\"\u001c\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\"\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00018\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2={"rotationBlockCache", "Lcom/kisman/cc/util/collections/LimitedHashMap;", "Lnet/minecraft/util/math/BlockPos;", "", "rotationEntityCache", "Lnet/minecraft/entity/Entity;", "rotateBlock", "Ljava/lang/Void;", "pos", "rotator", "Lcom/kisman/cc/util/enums/dynamic/RotationEnum$Rotation;", "silent", "", "rotateEntity", "entity", "kisman.cc"})
public final class OJABlAPdyVebeKqkgNsK8SgjycFXkkna {
    @JvmField
    @NotNull
    public static final B0T8OZ4NrpjDH06oaTzUnOqmIlCrw3Uh Field14844 = new B0T8OZ4NrpjDH06oaTzUnOqmIlCrw3Uh((int)((long)1695967477 ^ (long)1695967368) << 3);
    @JvmField
    @NotNull
    public static final B0T8OZ4NrpjDH06oaTzUnOqmIlCrw3Uh Field14845 = new B0T8OZ4NrpjDH06oaTzUnOqmIlCrw3Uh(((int)1808785238L ^ 0x6BCFDF2B) << 3);
    private int Field14846;

    @NotNull
    @NotNull
    public static final Void Method5894(@NotNull @NotNull Entity entity, @NotNull @NotNull a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, boolean bl) {
        Object object;
        Object[] objectArray;
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        Intrinsics.checkParameterIsNotNull((Object)((Object)a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (String)"rotator");
        Object[] objectArray2 = new Object[(int)((long)-1280322534 ^ (long)-1280322533) << 1];
        objectArray2[(int)((long)251046685 ^ (long)251046685)] = entity.entityId;
        objectArray2[(int)-1005165561L ^ 0xC4166406] = Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG.Field12640;
        Object object2 = a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method931().Method1726(objectArray2);
        int n = (int)((long)1063747610 ^ (long)1063747610);
        Object[] objectArray3 = objectArray = new Object[((int)467080603L ^ 0x1BD7159A) << 1];
        hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs2 = a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method929();
        int n2 = (int)2133412489L ^ 0x7F294A89;
        int n3 = (int)((long)-295112927 ^ (long)-295112927);
        float[] fArray = (float[])object2;
        int n4 = (int)((long)-476643549 ^ (long)-476643549);
        Map map = Field14845;
        Entity entity2 = entity;
        Intrinsics.checkExpressionValueIsNotNull((Object)fArray, (String)"it");
        float[] fArray2 = fArray;
        int n5 = (int)((long)1666334076 ^ (long)1666334076);
        map.put(entity2, fArray2);
        objectArray[n] = object = object2;
        objectArray3[(int)-2138103916L ^ 0x808F1F95] = bl;
        Object object3 = hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs2.Method1726(objectArray3);
        Intrinsics.checkExpressionValueIsNotNull((Object)object3, (String)"rotator.taskR.doTask(rot\u2026e[entity] = it }, silent)");
        return (Void)object3;
    }

    @NotNull
    @NotNull
    public static final Void Method5895(@NotNull @NotNull Entity entity, @NotNull @NotNull a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        Intrinsics.checkParameterIsNotNull((Object)entity, (String)"entity");
        Intrinsics.checkParameterIsNotNull((Object)((Object)a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (String)"rotator");
        return OJABlAPdyVebeKqkgNsK8SgjycFXkkna.Method5894(entity, a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, ((int)-61230039L ^ 0xFC59B429) != 0);
    }

    @NotNull
    @NotNull
    public static final Void Method5896(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, boolean bl) {
        Object object;
        Object[] objectArray;
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)((Object)a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (String)"rotator");
        Object[] objectArray2 = new Object[(int)((long)1841357698 ^ (long)1841357699)];
        objectArray2[(int)1578341372L ^ 0x5E1393FC] = blockPos;
        Object object2 = a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method932().Method1726(objectArray2);
        int n = (int)-1909252511L ^ 0x8E331E61;
        Object[] objectArray3 = objectArray = new Object[((int)-106446370L ^ 0xF9A7C1DF) << 1];
        hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs2 = a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method929();
        int n2 = (int)((long)265943620 ^ (long)265943620);
        int n3 = (int)-1728951382L ^ 0x98F24BAA;
        float[] fArray = (float[])object2;
        int n4 = (int)((long)907778133 ^ (long)907778133);
        Map map = Field14844;
        BlockPos blockPos2 = blockPos;
        Intrinsics.checkExpressionValueIsNotNull((Object)fArray, (String)"it");
        float[] fArray2 = fArray;
        int n5 = (int)-928772704L ^ 0xC8A40DA0;
        map.put(blockPos2, fArray2);
        objectArray[n] = object = object2;
        objectArray3[(int)1498545598L ^ 0x5951FDBF] = bl;
        Object object3 = hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs2.Method1726(objectArray3);
        Intrinsics.checkExpressionValueIsNotNull((Object)object3, (String)"rotator.taskR.doTask(rot\u2026ache[pos] = it }, silent)");
        return (Void)object3;
    }

    @NotNull
    @NotNull
    public static final Void Method5897(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)((Object)a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf), (String)"rotator");
        return OJABlAPdyVebeKqkgNsK8SgjycFXkkna.Method5896(blockPos, a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, ((int)1824869714L ^ 0x6CC54D52) != 0);
    }

    private static String Method5898(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1177068326 ^ (long)1177068326);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1248564978 ^ (long)1248564749);
            int n2 = (int)((long)-262450089 ^ (long)-262450086) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-787266584L ^ 0xD1132557 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

