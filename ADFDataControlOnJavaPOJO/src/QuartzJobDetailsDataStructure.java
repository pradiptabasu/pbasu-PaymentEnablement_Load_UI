import java.util.Date;

import oracle.binding.AttributeContext;
import oracle.binding.RowContext;

public class QuartzJobDetailsDataStructure {
    public QuartzJobDetailsDataStructure() {
        super();
    }

    public String field1;
    int field2;
    Date field3;

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField1() {
        return field1;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public int getField2() {
        return field2;
    }

    public void setField3(Date field3) {
        this.field3 = field3;
    }

    public Date getField3() {
        return field3;
    }

    public boolean setAttributeValue(AttributeContext p0, Object p1) {
        return false;
    }

    public Object createRowData(RowContext p0) {
        return null;
    }

    public Object registerDataProvider(RowContext p0) {
        return null;
    }

    public boolean removeRowData(RowContext p0) {
        return false;
    }

    public void validate() {
    }
}
