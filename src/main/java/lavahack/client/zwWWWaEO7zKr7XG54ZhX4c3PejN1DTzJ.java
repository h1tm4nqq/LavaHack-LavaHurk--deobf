/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Event;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.GAy9jV5JLrUCU1UxQkzXttscRqZTYALl;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qb1yYFNvzTdeM4b9Rg8oe7A4N8NQcVc4;

public class zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ
implements qb1yYFNvzTdeM4b9Rg8oe7A4N8NQcVc4 {
    private final Map Field8263 = new ConcurrentHashMap();
    private final Map Field8264 = new ConcurrentHashMap();
    private String Field8265 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method705(GAy9jV5JLrUCU1UxQkzXttscRqZTYALl gAy9jV5JLrUCU1UxQkzXttscRqZTYALl) {
        List list = this.Field8263.computeIfAbsent(gAy9jV5JLrUCU1UxQkzXttscRqZTYALl, zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ::Method724);
        list.forEach(this::Method706);
    }

    @Override
    public void Method706(CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt) {
        int n;
        List list = this.Field8264.computeIfAbsent(cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt.Method2651(), zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ::Method723);
        for (n = (int)-352420815L ^ 0xEAFE7C31; n < list.size() && cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt.Method2652() <= ((CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt)list.get(n)).Method2652(); ++n) {
        }
        list.add(n, cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt);
    }

    @Override
    public void Method710(GAy9jV5JLrUCU1UxQkzXttscRqZTYALl gAy9jV5JLrUCU1UxQkzXttscRqZTYALl) {
        List list = (List)this.Field8263.get(gAy9jV5JLrUCU1UxQkzXttscRqZTYALl);
        if (list == null) {
            return;
        }
        this.Field8264.values().forEach(arg_0 -> zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ.Method722(list, arg_0));
    }

    @Override
    public void Method711(CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt) {
        ((List)this.Field8264.get(cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt.Method2651())).removeIf(arg_0 -> zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ.Method721(cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt, arg_0));
    }

    @Override
    public void Method715(Object object) {
        List list;
        if (object instanceof Event && leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16283 != null && leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16251) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16283.Method6534("events", ((Event)object).Method162());
        }
        if ((list = (List)this.Field8264.get(object.getClass())) == null) return;
        list.forEach(arg_0 -> zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ.Method720(object, arg_0));
    }

    private static boolean Method717(Field field) {
        int n;
        if (field.isAnnotationPresent(F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa.class) && CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt.class.isAssignableFrom(field.getType())) {
            n = (int)583470338L ^ 0x22C70D03;
            return n != 0;
        }
        n = (int)-660330776L ^ 0xD8A426E8;
        return n != 0;
    }

    private static CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Method718(GAy9jV5JLrUCU1UxQkzXttscRqZTYALl gAy9jV5JLrUCU1UxQkzXttscRqZTYALl, Field field) {
        boolean bl = field.isAccessible();
        field.setAccessible(((int)1256863265L ^ 0x4AEA3620) != 0);
        CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt = (CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt)field.get(gAy9jV5JLrUCU1UxQkzXttscRqZTYALl);
        field.setAccessible(bl);
        if (cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt != null) return cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
        return null;
    }

    @Override
    public void Method716(Object object) {
        List list;
        if (object instanceof Event && leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16283 != null && leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16251) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16283.Method6534("events", ((Event)object).Method162());
        }
        if ((list = (List)this.Field8264.get(object.getClass())) == null) return;
        Collections.reverse(list);
        list.forEach(arg_0 -> zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ.Method719(object, arg_0));
    }

    private static void Method719(Object object, CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt) {
        cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt.Method979(object);
    }

    private static void Method720(Object object, CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt) {
        cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt.Method979(object);
    }

    private static boolean Method721(CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt, CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt2) {
        return cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt2.equals(cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt);
    }

    private static void Method722(List list, List list2) {
        list2.removeIf(list::contains);
    }

    private static List Method723(Class clazz) {
        return new CopyOnWriteArrayList();
    }

    private static List Method724(GAy9jV5JLrUCU1UxQkzXttscRqZTYALl gAy9jV5JLrUCU1UxQkzXttscRqZTYALl) {
        return Arrays.stream(gAy9jV5JLrUCU1UxQkzXttscRqZTYALl.getClass().getDeclaredFields()).filter(zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ::Method717).map(arg_0 -> zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ.Method725(gAy9jV5JLrUCU1UxQkzXttscRqZTYALl, arg_0)).filter(Objects::nonNull).collect(Collectors.toList());
    }

    private static CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Method725(GAy9jV5JLrUCU1UxQkzXttscRqZTYALl gAy9jV5JLrUCU1UxQkzXttscRqZTYALl, Field field) {
        return zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ.Method718(gAy9jV5JLrUCU1UxQkzXttscRqZTYALl, field);
    }

    private static String Method726(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)800930991L ^ 0x2FBD3CAF;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1956951765 ^ (long)-1956951596);
            int n2 = (int)((long)531154496 ^ (long)531154505) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)824658297 ^ (long)824658348) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

