// A class demonstrating encapsulation
public class Student {
        private String name;
        private int age;

        //Setter methods
        public void setName(String name)
        {
            this.name = name;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            }
        }

        // Getter Methods
        public String getName()
        {
            return name;
        }
        public int getAge()
        {
            return age;
        }
}
