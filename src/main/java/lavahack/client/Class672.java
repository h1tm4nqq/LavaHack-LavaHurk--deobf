//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;

public interface Class672
{
    void Method705(final Class1320 p0);
    
    void Method706(final Class618 p0);
    
    default void Method707(final Class1320... array) {
        Arrays.stream(array).forEach(this::Method705);
    }
    
    default void Method708(final Iterable iterable) {
        iterable.forEach(this::Method705);
    }
    
    default void Method709(final Class618... array) {
        Arrays.stream(array).forEach(this::Method706);
    }
    
    void Method710(final Class1320 p0);
    
    void Method711(final Class618 p0);
    
    default void Method712(final Class1320... array) {
        Arrays.stream(array).forEach(this::Method710);
    }
    
    default void Method713(final Iterable iterable) {
        iterable.forEach(this::Method710);
    }
    
    default void Method714(final Class618... array) {
        Arrays.stream(array).forEach(this::Method711);
    }
    
    void Method715(final Object p0);
    
    void Method716(final Object p0);
}
