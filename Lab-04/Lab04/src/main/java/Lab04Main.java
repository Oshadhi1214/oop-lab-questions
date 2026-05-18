package lab04;

// staffCount is static because
// it is shared among all staff objects.

// changeDepartment() is useful
// because it controls department updates safely.

public class Lab04Main {

    public static void main(String[] args) {

        StaffMember.showSystemName();

        System.out.println();

        UniversityPolicy.showPolicyHeader();

        System.out.println("University Name: "
                + UniversityPolicy.UNIVERSITY_NAME);

        System.out.println();

        Lecturer lecturer1 =
                new Lecturer(
                        "Nimal Perera",
                        "L001",
                        "ICT",
                        3,
                        50000);

        Lecturer lecturer2 =
                new Lecturer(
                        "Kasun Silva",
                        "L002",
                        "Software Engineering",
                        2,
                        45000);

        LabAssistant assistant1 =
                new LabAssistant(
                        "Ama Fernando",
                        "A001",
                        "Networking",
                        120,
                        500);

        assistant1.changeDepartment("Computer Science");

        System.out.println("===== Lecturer 1 =====");

        lecturer1.displayLecturerDetails();

        System.out.println("Monthly Payment: "
                + lecturer1.calculateMonthlyPayment());

        System.out.println();

        System.out.println("===== Lecturer 2 =====");

        lecturer2.displayLecturerDetails();

        System.out.println("Monthly Payment: "
                + lecturer2.calculateMonthlyPayment());

        System.out.println();

        System.out.println("===== Lab Assistant =====");

        assistant1.displayLabAssistantDetails();

        System.out.println("Monthly Payment: "
                + assistant1.calculateMonthlyPayment());

        System.out.println();

        double totalPayment =
                lecturer1.calculateMonthlyPayment()
                + lecturer2.calculateMonthlyPayment()
                + assistant1.calculateMonthlyPayment();

        System.out.println("Total Monthly Payment: "
                + totalPayment);

        System.out.println();

        System.out.println("Total Staff Count: "
                + StaffMember.getStaffCount());

        System.out.println();

        lecturer1.showCommonNotice();

        lecturer2.showCommonNotice();

        assistant1.showCommonNotice();

        System.out.println();

        System.out.println("Lecturer Bonus: "
                + UniversityPolicy.calculateBonus(
                        lecturer1.calculateMonthlyPayment()));

        System.out.println("Lab Assistant Bonus: "
                + UniversityPolicy.calculateBonus(
                        assistant1.calculateMonthlyPayment()));
    }
}