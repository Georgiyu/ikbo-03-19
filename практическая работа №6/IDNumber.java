package prac6;

public class IDNumber {
    private Student[] st;
    private int size;

    public IDNumber(int razmer){
        this.st = new Student[razmer];
    }

    public void sort(){
        for(int left=0; left<st.length; left++){
            Student value = st[left];
            int i = left - 1;
            for (; i>= 0; i--){
                if(value.getId()< st[i].getId()){
                    st[i+1] = st[i];
                }
                else{
                    break;
                }
            }
            st[i+1] = value;
        }
    }
    public void add(Student student){
        st[size] = student;
        size++;
    }
}
