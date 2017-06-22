package com.dalsoftware.calculadoratip.fragments;

import com.dalsoftware.calculadoratip.models.TipRecord;

/**
 * Created by glassy on 6/20/17.
 */

public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
