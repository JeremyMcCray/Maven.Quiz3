package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
Lab labName;
List<Lab>labList = new ArrayList<>();

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {

        labList.addAll(labs);
    }

    public Lab getLab(String labName) {
        for (Lab element: labList) {
            if(labName.equals(element.labName)){
                return element;

            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

    }

    public void forkLab(Lab lab) {
        this.labList.add(lab);
    lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {

        return null;
    }
}
