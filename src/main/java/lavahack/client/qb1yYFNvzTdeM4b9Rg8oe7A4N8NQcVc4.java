/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Arrays;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.GAy9jV5JLrUCU1UxQkzXttscRqZTYALl;

public interface qb1yYFNvzTdeM4b9Rg8oe7A4N8NQcVc4 {
    public void Method705(GAy9jV5JLrUCU1UxQkzXttscRqZTYALl var1);

    public void Method706(CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt var1);

    default public void Method707(GAy9jV5JLrUCU1UxQkzXttscRqZTYALl ... gAy9jV5JLrUCU1UxQkzXttscRqZTYALlArray) {
        Arrays.stream(gAy9jV5JLrUCU1UxQkzXttscRqZTYALlArray).forEach(this::Method705);
    }

    default public void Method708(Iterable iterable) {
        iterable.forEach(this::Method705);
    }

    default public void Method709(CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt ... cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYtArray) {
        Arrays.stream(cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYtArray).forEach(this::Method706);
    }

    public void Method710(GAy9jV5JLrUCU1UxQkzXttscRqZTYALl var1);

    public void Method711(CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt var1);

    default public void Method712(GAy9jV5JLrUCU1UxQkzXttscRqZTYALl ... gAy9jV5JLrUCU1UxQkzXttscRqZTYALlArray) {
        Arrays.stream(gAy9jV5JLrUCU1UxQkzXttscRqZTYALlArray).forEach(this::Method710);
    }

    default public void Method713(Iterable iterable) {
        iterable.forEach(this::Method710);
    }

    default public void Method714(CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt ... cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYtArray) {
        Arrays.stream(cWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYtArray).forEach(this::Method711);
    }

    public void Method715(Object var1);

    public void Method716(Object var1);
}

