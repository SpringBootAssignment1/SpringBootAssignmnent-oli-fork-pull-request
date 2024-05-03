import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Course {
    // Getter and setter methods
    private Long id;
        private String name;
        private String description;

        // Constructors
        public Course() {
        }

        public Course(Long id, String name, String description) {
            this.id = id;
            this.name = name;
            this.description = description;
        }

}


