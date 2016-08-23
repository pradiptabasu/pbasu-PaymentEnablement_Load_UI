import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import oracle.binding.AttributeContext;
import oracle.binding.RowContext;

public class QuartzJobDetailsArray {
    public QuartzJobDetailsArray() {
        super();
    }

    public ArrayList<QuartzJobDetailsDataStructure> getDetails() {
        QuartzJobDetailsArray objA = new QuartzJobDetailsArray();
        return objA.getEmpManager();
    }
    
    public static synchronized ArrayList<QuartzJobDetailsDataStructure> getEmpManager() {
        ArrayList<QuartzJobDetailsDataStructure> dataList = new ArrayList<QuartzJobDetailsDataStructure>();
        for (int i = 0; i < 10; i++) {
            QuartzJobDetailsDataStructure jobDet = new QuartzJobDetailsDataStructure();
            Date nowDate = new Date();
            jobDet.setField1("Field" + i);
            jobDet.setField2(i);
            jobDet.setField3(nowDate);
            dataList.add(jobDet);
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
            }
        }
        return dataList;
    }

    public Serializable createSnapshot() {
        return null;
    }

    public void restoreSnapshot(Serializable p0) {
    }

    public void removeSnapshot(Serializable p0) {
    }

    public boolean isTransactionDirty() {
        return false;
    }

    public void rollbackTransaction() {
    }

    public void commitTransaction() {
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
