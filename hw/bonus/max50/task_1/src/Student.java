public class Student {
   private String name;
   private int age;
   private String group;
   private float mean_score;

   public Student(String name, int age, String group, float mean_score) {
     this.name = name;
     this.age = age;
     this.group = group;
     this.mean_score = mean_score;
   }
   Student me = new Student ("Margarian Narek", 17, "125", 24 );

   public Student () {
   }
   public String getName () {
       return name;
   }
   public void setName (String name) {
       this.name = name;
   }
   public int getAge () {
       return age;
   }
    public void setAge (int age) {
        this.age = age;
   }
   public String getGroup () {
       return group;
   }
    public void setGroup (String group) {
        this.group = group;
   }
   public float getMean_score () {
       return mean_score;
   }
    public void setMean_score(float mean_score) {
        this.mean_score = mean_score;
   }
}