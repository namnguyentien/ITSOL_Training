package OOP.TeacherSalaryManagement.Entity;

public class Teaching {
    private Teacher teacher;
    private SubjectTeaching[] subjectTeachings;
    private double ExpenseTheoretical;

    public Teaching() {
    }

    public Teaching(Teacher teacher, SubjectTeaching[] subjectTeachings) {
        this.teacher = teacher;
        this.subjectTeachings = subjectTeachings;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public SubjectTeaching[] getSubjectTeachings() {
        return subjectTeachings;
    }

    public void setSubjectTeachings(SubjectTeaching[] subjectTeachings) {
        this.subjectTeachings = subjectTeachings;
    }


    public int getCurrentTotalLesson() {
        int currentTotalLesson = 0;
        for (int i = 0; i < subjectTeachings.length; i++) {
            Subject subject = subjectTeachings[i].getSubject();
            int classQuantity = subjectTeachings[i].getClassQuantity();
            currentTotalLesson += subject.getNumberOfLessons() * classQuantity;
        }
        return currentTotalLesson;
    }
}
