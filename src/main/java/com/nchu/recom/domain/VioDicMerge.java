package com.nchu.recom.domain;

public class VioDicMerge {
    private VioDic oldVioDic;
    private VioDic newVioDic;

    public VioDicMerge(VioDic oldVioDic, VioDic newVioDic) {
        this.oldVioDic = oldVioDic;
        this.newVioDic = newVioDic;
    }

    public VioDic getOldVioDic() {
        return oldVioDic;
    }

    public void setOldVioDic(VioDic oldVioDic) {
        this.oldVioDic = oldVioDic;
    }

    public VioDic getNewVioDic() {
        return newVioDic;
    }

    public void setNewVioDic(VioDic newVioDic) {
        this.newVioDic = newVioDic;
    }
}
