package rocks.zipcode.io.quiz3.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
Lab labName;
List<Lab> labList;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {

        this.labList = labs;
    }

    public Lab getLab(String labName) {
        for (Lab element: labList) {
            if(labName.equals(element.labName)){
                return element;

            }        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        
    }

    public void forkLab(Lab lab) {
    labList.add(lab);
    }

    public LabStatus getLabStatus(String labName) {

        return null;
    }
}
