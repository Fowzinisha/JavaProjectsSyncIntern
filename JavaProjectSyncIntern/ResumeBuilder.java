import java.util.ArrayList;
import java.util.Scanner;

class Resume {
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<String> skills;
    private ArrayList<String> experience;

    public Resume() {
        skills = new ArrayList<>();
        experience = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void addExperience(String exp) {
        experience.add(exp);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);

        System.out.println("\nSkills:");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }

        System.out.println("\nExperience:");
        for (String exp : experience) {
            System.out.println("- " + exp);
        }
    }
}

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resume resume = new Resume();

        System.out.print("Enter your name: ");
        resume.setName(scanner.nextLine());

        System.out.print("Enter your email: ");
        resume.setEmail(scanner.nextLine());

        System.out.print("Enter your phone number: ");
        resume.setPhoneNumber(scanner.nextLine());

        while (true) {
            System.out.print("Enter a skill (or type 'done' to finish): ");
            String skill = scanner.nextLine();
            if (skill.equalsIgnoreCase("done")) {
                break;
            }
            resume.addSkill(skill);
        }

        while (true) {
            System.out.print("Enter an experience (or type 'done' to finish): ");
            String exp = scanner.nextLine();
            if (exp.equalsIgnoreCase("done")) {
                break;
            }
            resume.addExperience(exp);
        }

        System.out.println("\nResume:");
        resume.display();

        scanner.close();
    }
}
