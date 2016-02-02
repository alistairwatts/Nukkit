package cn.nukkit.item;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class Potato extends EdibleItem {

    public Potato() {
        this(0, 1);
    }

    public Potato(Integer meta) {
        this(meta, 1);
    }

    public Potato(Integer meta, int count) {
        super(POTATO, meta, count, "Potato");
        this.block = new cn.nukkit.block.Potato();
    }

    protected Potato(int id, Integer meta, int count, String name) {
        super(id, meta, count, name);
    }
}
