/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import kotlin.Metadata;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/pingbypass/server/nethandler/IPingBypassNetHandler$Companion;", "", "()V", "LOGGER", "Lorg/apache/logging/log4j/Logger;", "kotlin.jvm.PlatformType", "getLOGGER", "()Lorg/apache/logging/log4j/Logger;", "kisman.cc"})
public final class Class2039 {
    private static final Logger Field17371;
    static final Class2039 Field17372;
    private String Field17373 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final Logger Method7534() {
        return Field17371;
    }

    private Class2039() {
    }

    static {
        Class2039 class2039;
        Field17372 = class2039 = new Class2039();
        Field17371 = LogManager.getLogger();
    }
}

