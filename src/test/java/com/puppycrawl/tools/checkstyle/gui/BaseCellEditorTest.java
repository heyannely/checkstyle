package com.puppycrawl.tools.checkstyle.gui;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertWithMessage;

public class BaseCellEditorTest {
    private BaseCellEditor bce = new BaseCellEditor();

    @Test
    void testToString() {
        assertWithMessage("is null")
                .that(bce.getCellEditorValue() == null)
                .isEqualTo(true);
    }

    @Test
    public void testStopCellEditing() {
        assertWithMessage("StopEditing return true")
                .that(bce.stopCellEditing())
                .isEqualTo(true);
    }
}
