package menu;

import enums.*;
import model.*;
import org.joda.time.DateTime;
import service.educationLoan.EducationLoanService;
import service.mortgage.MortgageService;
import service.paidInstallments.PaidInstallmentsService;
import service.student.StudentService;
import service.tuitionLoan.TuitionLoanService;
import service.unpaidInstallments.UnpaidInstallmentsService;
import service.wifeOrHusband.WifeOrHusbandService;
import util.PasswordGenerator;
import util.applicationcontext.ApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Menu {

    private final Scanner sc = new Scanner(System.in);

    StudentService studentService = ApplicationContext.getStudentService();
    WifeOrHusbandService wifeOrHusbandService = ApplicationContext.getWifeOrHusbandService();
    EducationLoanService educationLoanService = ApplicationContext.getEducationLoanService();
    TuitionLoanService tuitionLoanService = ApplicationContext.getTuitionLoanService();
    MortgageService mortgageService = ApplicationContext.getMortgageService();
    UnpaidInstallmentsService unpaidInstallmentsService = ApplicationContext.getUnpaidInstallmentsService();
    PaidInstallmentsService paidInstallmentsService = ApplicationContext.getPaidInstallmentsService();

    public int getNumberFromUser() {
        int num = 0;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.nextLine();
        }
        return num;
    }

    public Long getLongNumberFromUser() {
        long num = 0L;
        try {
            num = sc.nextLong();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.nextLine();
        }
        return num;
    }

    public String getStringFromUser() {
        String input = null;
        try {
            input = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return input;
    }

    public String getFirstName() {
        System.out.println("please enter your first name");
        return getStringFromUser();
    }

    public String getLastName() {
        System.out.println("please enter your last name");
        return getStringFromUser();
    }

    public String getFatherName() {
        System.out.println("please enter your father name");
        return getStringFromUser();
    }

    public String getMotherName() {
        System.out.println("please enter your mother name");
        return getStringFromUser();
    }

    public String getNationalCode() {
        System.out.println("please enter your National Code");
        return getStringFromUser();
    }

    public String getPhoneNumber() {
        System.out.println("please enter your Phone Number");
        return getStringFromUser();
    }

    public String getBirthDate() {
        System.out.println("please enter your Birth Date");
        System.out.println("yyyy-MM-dd");
        return getStringFromUser();
    }

    public String getStudentCode() {
        System.out.println("please enter your student code");
        return getStringFromUser();
    }

    public String getUniversityName() {
        System.out.println("please enter your university name");
        return getStringFromUser();
    }

    public UniversityTypes getUniversityType() {
        System.out.println("please choose your university type");
        System.out.println("press 1 for GOVERNMENTAL university");
        System.out.println("press 2 for AZAD university");
        System.out.println("press 3 for PAYAMNOOR university");
        System.out.println("press 4 for NONPROFIT university");
        System.out.println("press 5 for APPLIEDSCIENCE university");
        System.out.println("press 6 for EXCESSCAPACITY university");
        System.out.println("press 7 for PARDIS university");

        int chooseUniversityType = getNumberFromUser();
        UniversityTypes universityType = null;
        switch (chooseUniversityType) {
            case 1 -> universityType = UniversityTypes.GOVERNMENTAL;
            case 2 -> universityType = UniversityTypes.AZAD;
            case 3 -> universityType = UniversityTypes.PAYAMNOOR;
            case 4 -> universityType = UniversityTypes.NONPROFIT;
            case 5 -> universityType = UniversityTypes.APPLIEDSCIENCE;
            case 6 -> universityType = UniversityTypes.EXCESSCAPACITY;
            case 7 -> universityType = UniversityTypes.PARDIS;
            default -> getUniversityType();
        }
        return universityType;
    }

    public String getEntryDate() {
        System.out.println("please enter your Entry Date");
        System.out.println("yyyy-MM-dd");
        return getStringFromUser();
    }

    public Grades getStudentGrade() {
        System.out.println("please choose your Grade");
        System.out.println("press 1 for ASSOCIATEDEGREE");
        System.out.println("press 2 for BACHELORSDEGREE");
        System.out.println("press 3 for MASTERSDEGREE");
        System.out.println("press 4 for DOCTORATE");

        int chooseGrade = getNumberFromUser();
        Grades grade = null;
        switch (chooseGrade) {
            case 1 -> grade = Grades.ASSOCIATEDEGREE;
            case 2 -> grade = Grades.BACHELORSDEGREE;
            case 3 -> grade = Grades.MASTERSDEGREE;
            case 4 -> grade = Grades.DOCTORATE;
            default -> getStudentGrade();
        }
        return grade;
    }

    public Style getStudentStyle() {
        System.out.println("please choose your Style");
        System.out.println("press 1 for CONTINUOUS");
        System.out.println("press 2 for DISCONTINUOUS");

        int chooseStyle = getNumberFromUser();
        Style style = null;
        switch (chooseStyle) {
            case 1 -> style = Style.CONTINUOUS;
            case 2 -> style = Style.DISCONTINUOUS;
            default -> getStudentStyle();
        }
        return style;
    }

    public MaritalStatus getMaritalStatus() {
        System.out.println("please choose your Marital Status");
        System.out.println("press 1 for MARRIED");
        System.out.println("press 1 for SINGLE");

        int chooseMaritalStatus = getNumberFromUser();
        MaritalStatus maritalStatus = null;
        switch (chooseMaritalStatus) {
            case 1 -> maritalStatus = MaritalStatus.MARRIED;
            case 2 -> maritalStatus = MaritalStatus.SINGLE;
            default -> getMaritalStatus();
        }
        return maritalStatus;
    }

    public String getBankCardNumber() {
        System.out.println("please enter your bank card number");
        return getStringFromUser();
    }

    public String getBankCardCvv2() {
        System.out.println("please enter your bank card cvv2");
        return getStringFromUser();
    }

    public String getBankCardExpireDate() {
        System.out.println("please enter your Entry Date");
        System.out.println("yyyy-MM");
        return getStringFromUser();
    }

    public String getCity() {
        System.out.println("please enter your city");
        return getStringFromUser();
    }

    public String getAddress() {
        System.out.println("please enter your address");
        return getStringFromUser();
    }

    public String getContractNumber() {
        System.out.println("please enter your contract Number");
        return getStringFromUser();
    }

    public static Date creatDate(String date) {
        Date date1;
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date1;
    }

    public static Date creatDateEx(String date) {
        Date date1;
        try {
            date1 = new SimpleDateFormat("yyyy-MM").parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date1;
    }

    public static String creatPassword() {
        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .usePunctuation(true)
                .build();
        return passwordGenerator.generate(8);
    }

    public void showBankCard(Student student) {
        String bankcard = student.getCardNumber();
        char[] spl = bankcard.toCharArray();
        for (int i = 0; i < 16; i++) {
            if (i == 3 || i == 7 || i == 11) {
                System.out.print(spl[i] + "-");
            } else {
                System.out.print(spl[i]);
            }
        }
    }

    public void startMenu() {
        System.out.println("******WELCOME******");
        System.out.println("please press 1 sign up");
        System.out.println("please press 2 sign in");
        int choose = getNumberFromUser();
        switch (choose) {
            case 1 -> signUp();
            case 2 -> signIn();
            default -> startMenu();
        }
    }

    public void secondMenu(Student student) {
        System.out.println("press 1 for request a loan");
        System.out.println("press 2 for see your loans condition");
        int choose = getNumberFromUser();
        switch (choose) {
            case 1 -> checkRequestDate(student);
            case 2 -> checkLoanCondition(student);
            default -> secondMenu(student);
        }
    }

    public void checkGraduation(Student student) {
        Grades grade = student.getGrade();
        Style style = student.getStyle();
        Date nowTime = new Date(System.currentTimeMillis());
        Date entry = student.getEnterDate();
        DateTime curJoda = new DateTime(nowTime);
        DateTime entJoda = new DateTime(entry);
        int limit = curJoda.getYear() - entJoda.getYear();

        if (grade == Grades.ASSOCIATEDEGREE && limit <= 2) {
            requestForLoan(student);
        } else if (grade == Grades.MASTERSDEGREE && style == Style.DISCONTINUOUS && limit <= 2) {
            requestForLoan(student);
        } else if (grade == Grades.BACHELORSDEGREE && limit <= 4) {
            requestForLoan(student);
        } else if (grade == Grades.MASTERSDEGREE && style == Style.CONTINUOUS && limit <= 6) {
            requestForLoan(student);
        } else if (grade == Grades.DOCTORATE && limit <= 5) {
            requestForLoan(student);
        } else {
            System.out.println("you are Graduated and you can not request new loan, you can check your loan condition");
            checkLoanCondition(student);
        }
    }


    public void signUp() {
        UniversityTypes universityTypes;
        Student student = Student.builder()
                .firstName(getFirstName())
                .lastName(getLastName())
                .fatherName(getFatherName())
                .motherName(getMotherName())
                .password(creatPassword())
                .nationalCode(getNationalCode())
                .phoneNumber(getPhoneNumber())
                .birthdate(creatDate(getBirthDate()))
                .studentCode(getStudentCode())
                .universityName(getUniversityName())
                .universityTypes(universityTypes = getUniversityType())
                .enterDate(creatDate(getEntryDate()))
                .grade(getStudentGrade())
                .style(getStudentStyle())
                .dayOrNight(takeDayOrNight(universityTypes))
                .maritalStatus(getMaritalStatus())
                .city(getCity())
                .address(getAddress())
                .cardNumber(getBankCardNumber())
                .cvv2(getBankCardCvv2())
                .expireCardDate(creatDateEx(getBankCardExpireDate()))
                .build();
        if (studentService.validate(student)) {
            studentService.saveOrUpdate(student);
            enterWifeOrHusbandInfo(student);
            showSignUpInfo(student);
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            startMenu();
        } else {
            signUp();
        }
    }

    public DayOrNight takeDayOrNight(UniversityTypes universityType) {
        DayOrNight dayOrNight = null;
        if (universityType == UniversityTypes.GOVERNMENTAL) {
            System.out.println("press 1 for Daily");
            System.out.println("press 2 for at night");
            int choose = getNumberFromUser();
            switch (choose) {
                case 1 -> dayOrNight = DayOrNight.DAY;
                case 2 -> dayOrNight = DayOrNight.NIGHT;
                default -> takeDayOrNight(universityType);
            }
        }
        return dayOrNight;
    }

    public void enterWifeOrHusbandInfo(Student student) {
        if (student.getMaritalStatus() == MaritalStatus.MARRIED) {
            System.out.println("please enter yor wife or husband information");
            WifeOrHusband wifeOrHusband = WifeOrHusband.builder()
                    .firstName(getFirstName())
                    .lastName(getLastName())
                    .nationalCode(getNationalCode())
                    .student(student)
                    .build();
            if (wifeOrHusbandService.validate(wifeOrHusband)) {
                wifeOrHusbandService.saveOrUpdate(wifeOrHusband);
            } else {
                enterWifeOrHusbandInfo(student);
            }
        }
    }

    public void showSignUpInfo(Student student) {
        System.out.println("your username is your national Code ");
        System.out.println("this is your password please write it down it will disappear after 5 second ");
        System.out.println(student.getPassword());
    }

    public void signIn() {
        String username = getNationalCode();
        System.out.println("please enter your password");
        String password = getStringFromUser();
        Student student = null;
        try {
            student = studentService.findByUserAndPass(username, password);
        } catch (IllegalStateException e) {
            System.out.println("wrong username or password");
            startMenu();
        }
        if (student != null) {
            secondMenu(student);
        } else {
            System.out.println("wrong username or password");
            startMenu();
        }
    }

    public void requestForLoan(Student student) {
        System.out.println("press 1 for EducationLoan");
        System.out.println("press 2 for TuitionLoan");
        System.out.println("press 3 for Mortgage");
        int choose = getNumberFromUser();
        switch (choose) {
            case 1 -> requestEducationLoan(student);
            case 2 -> requestTuitionLoan(student);
            case 3 -> requestMortgage(student);
            default -> requestForLoan(student);
        }
    }

    public void checkRequestDate(Student student) {
        Date minDate1 = creatDate("2024-10-21");
        Date minDate2 = creatDate("2025-2-12");
        Date maxDate1 = creatDate("2024-10-28");
        Date maxDate2 = creatDate("2025-2-19");
        Date current = new Date(System.currentTimeMillis());
        DateTime jodaMin1 = new DateTime(minDate1);
        DateTime jodaMin2 = new DateTime(minDate2);
        DateTime jodaMax1 = new DateTime(maxDate1);
        DateTime jodaMax2 = new DateTime(maxDate2);
        DateTime jodaCur = new DateTime(current);
        if (jodaCur.getYear() > jodaMin1.getYear()) {
            minDate1 = jodaMin1.plusYears(jodaCur.getYear() - jodaMin1.getYear()).toDate();
            maxDate1 = jodaMax1.plusYears(jodaCur.getYear() - jodaMin1.getYear()).toDate();
        }
        if (jodaCur.getYear() > jodaMin2.getYear()) {
            minDate2 = jodaMin1.plusYears(jodaCur.getYear() - jodaMin2.getYear()).toDate();
            maxDate2 = jodaMax2.plusYears(jodaCur.getYear() - jodaMin2.getYear()).toDate();
        }
        if (current.after(minDate1) && current.before(maxDate1)) {
            checkGraduation(student);
        } else if (current.after(minDate2) && current.before(maxDate2)) {
            checkGraduation(student);
        } else {
            System.out.println("request for loan is not allowed in this date");
            System.out.println("it will be able between 21-10 until 28-10 and 12-2 until 19-2 per year");
            secondMenu(student);
        }
    }

    public void checkLoanCondition(Student student) {
        System.out.println("press 1 for check your EducationLoans");
        System.out.println("press 2 for check your TuitionLoans");
        System.out.println("press 3 for check your Mortgages");
        System.out.println("press 4 for exit");
        int choose = getNumberFromUser();
        switch (choose) {
            case 1 -> checkEducationLoans(student);
            case 2 -> checkTuitionLoans(student);
            case 3 -> checkMortgage(student);
            case 4 -> secondMenu(student);
            default -> checkLoanCondition(student);
        }
    }

    public void checkEducationLoans(Student student) {
        System.out.println("press 1 for check UnpaidInstallments");
        System.out.println("press 2 for check paidInstallments");
        System.out.println("press 3 for exit");
        int choose = getNumberFromUser();
        switch (choose) {
            case 1 -> checkUnpaidInstallmentsEducationLoans(student);
            case 2 -> checkPaidInstallmentsEducationLoans(student);
            case 3 -> secondMenu(student);
            default -> checkEducationLoans(student);
        }
    }

    public void checkTuitionLoans(Student student) {
        System.out.println("press 1 for check UnpaidInstallments");
        System.out.println("press 2 for check paidInstallments");
        System.out.println("press 3 for exit");
        int choose = getNumberFromUser();
        switch (choose) {
            case 1 -> checkUnpaidInstallmentsTuitionLoans(student);
            case 2 -> checkPaidInstallmentsTuitionLoans(student);
            case 3 -> secondMenu(student);
            default -> checkTuitionLoans(student);
        }
    }

    public void checkMortgage(Student student) {
        System.out.println("press 1 for check UnpaidInstallments");
        System.out.println("press 2 for check paidInstallments");
        System.out.println("press 3 for exit");
        int choose = getNumberFromUser();
        switch (choose) {
            case 1 -> checkUnpaidInstallmentsMortgage(student);
            case 2 -> checkPaidInstallmentsMortgage(student);
            case 3 -> secondMenu(student);
            default -> checkTuitionLoans(student);
        }
    }

    public void checkUnpaidInstallmentsEducationLoans(Student student) {
        long total = 0;
        List<EducationLoan> educationLoans = educationLoanService.educationLoans(student.getId());
        if (educationLoans.size() == 0) {
            System.out.println("you dont have any unpaid educationLoan");
            secondMenu(student);
        } else if (educationLoans.size() == 1) {
            EducationLoan educationLoan = educationLoans.get(0);
            List<UnpaidInstallments> unpaidInstallments =
                    unpaidInstallmentsService.unpaidInstallmentsEducation(educationLoan.getId());
            if (unpaidInstallments.size() > 0) {
                for (UnpaidInstallments unpaidInstallments1 : unpaidInstallments) {
                    System.out.println(unpaidInstallments1.getDate() + " " + unpaidInstallments1.getAmount());
                    total += unpaidInstallments1.getAmount();
                }
                System.out.println("this loan amount is: " + amountOfEducationLoan(educationLoan));
                System.out.println("your total left over payment is " + total);
                System.out.println("do you want to pay your installment?y/n");
                String choose = getStringFromUser();
                if (choose.equals("y")) {
                    payInstallmentEduction(unpaidInstallments, student);
                    checkLoanCondition(student);
                } else {
                    checkLoanCondition(student);
                }
            } else {
                System.out.println("This loan has been settled");
                secondMenu(student);
            }
        } else {
            System.out.println("all of your educationLoans are:");
            for (EducationLoan educationLoan : educationLoans) {
                System.out.println(educationLoans.indexOf(educationLoan) + 1 + " id: " + educationLoan.getId() + " " + educationLoan.getTimeOfTakeLoan());
            }
            System.out.println("please enter your loan id to check");
            Long choose = getLongNumberFromUser();
            List<UnpaidInstallments> unpaidInstallments =
                    unpaidInstallmentsService.unpaidInstallmentsEducation(choose);
            if (unpaidInstallments.size() > 0) {
                for (UnpaidInstallments unpaidInstallments1 : unpaidInstallments) {
                    System.out.println(unpaidInstallments1.getDate() + " " + unpaidInstallments1.getAmount());
                    total += unpaidInstallments1.getAmount();
                }
                System.out.println("this loan amount is: " + amountOfEducationLoan(educationLoanService.findById(choose)));
                System.out.println("your total left over payment is " + total);
                System.out.println("do you want to pay your installment?y/n");
                String choose1 = getStringFromUser();
                if (choose1.equals("y")) {
                    payInstallmentEduction(unpaidInstallments, student);
                    checkLoanCondition(student);
                } else {
                    checkLoanCondition(student);
                }
            } else {
                System.out.println("This loan has been settled");
                secondMenu(student);
            }
        }
    }

    public void checkUnpaidInstallmentsTuitionLoans(Student student) {
        long total = 0;
        List<TuitionLoan> tuitionLoans = tuitionLoanService.tuitionLoans(student.getId());
        if (tuitionLoans.size() == 0) {
            System.out.println("you dont have any unpaid tuitionLoans");
            secondMenu(student);
        } else if (tuitionLoans.size() == 1) {
            TuitionLoan tuitionLoan = tuitionLoans.get(0);
            List<UnpaidInstallments> unpaidInstallments =
                    unpaidInstallmentsService.unpaidInstallmentsTuition(tuitionLoan.getId());
            if (unpaidInstallments.size() > 0) {
                for (UnpaidInstallments unpaidInstallments1 : unpaidInstallments) {
                    System.out.println(unpaidInstallments1.getDate() + " " + unpaidInstallments1.getAmount());
                    total += unpaidInstallments1.getAmount();
                }
                System.out.println("this loan amount is: " + amountOfTuitionLoan(tuitionLoan));
                System.out.println("your total left over payment is " + total);
                System.out.println("do you want to pay your installment?y/n");
                String choose = getStringFromUser();
                if (choose.equals("y")) {
                    payInstallmentTuition(unpaidInstallments, student);
                    checkLoanCondition(student);
                } else {
                    checkLoanCondition(student);
                }
            } else {
                System.out.println("This loan has been settled");
                secondMenu(student);
            }
        } else {
            System.out.println("all of your tuitionLoans are:");
            for (TuitionLoan tuitionLoan : tuitionLoans) {
                System.out.println(tuitionLoans.indexOf(tuitionLoan) + 1 + " id: " + tuitionLoan.getId() + " " + tuitionLoan.getTimeOfTakeLoan());
            }
            System.out.println("please enter your loan id to check");
            Long choose = getLongNumberFromUser();
            List<UnpaidInstallments> unpaidInstallments =
                    unpaidInstallmentsService.unpaidInstallmentsTuition(choose);
            if (unpaidInstallments.size() > 0) {
                for (UnpaidInstallments unpaidInstallments1 : unpaidInstallments) {
                    System.out.println(unpaidInstallments1.getDate() + " " + unpaidInstallments1.getAmount());
                    total += unpaidInstallments1.getAmount();
                }
                System.out.println("this loan amount is: " + amountOfTuitionLoan(tuitionLoanService.findById(choose)));
                System.out.println("your total left over payment is " + total);
                System.out.println("do you want to pay your installment?y/n");
                String choose1 = getStringFromUser();
                if (choose1.equals("y")) {
                    payInstallmentTuition(unpaidInstallments, student);
                    checkLoanCondition(student);
                } else {
                    checkLoanCondition(student);
                }
            } else {
                System.out.println("This loan has been settled");
                secondMenu(student);
            }
        }
    }

    public void checkUnpaidInstallmentsMortgage(Student student) {
        long total = 0;
        Mortgage mortgage = mortgageService.mortgage(student.getId());
        if (mortgage == null) {
            System.out.println("you dont have any unpaid mortgage");
            secondMenu(student);
        } else {
            List<UnpaidInstallments> unpaidInstallments =
                    unpaidInstallmentsService.unpaidInstallmentsMortgage(mortgage.getId());
            if (unpaidInstallments.size() > 0) {
                for (UnpaidInstallments unpaidInstallments1 : unpaidInstallments) {
                    System.out.println(unpaidInstallments1.getDate() + " " + unpaidInstallments1.getAmount());
                    total += unpaidInstallments1.getAmount();
                }
                System.out.println("this loan amount is: " + amountOfTMortgage(mortgage));
                System.out.println("your total left over payment is " + total);
                System.out.println("do you want to pay your installment?y/n");
                String choose = getStringFromUser();
                if (choose.equals("y")) {
                    payInstallmentMortgage(unpaidInstallments, student);
                    checkLoanCondition(student);
                } else {
                    checkLoanCondition(student);
                }
            } else {
                System.out.println("This loan has been settled");
                secondMenu(student);
            }
        }
    }

    public void checkPaidInstallmentsEducationLoans(Student student) {
        List<EducationLoan> educationLoans = educationLoanService.educationLoans(student.getId());
        if (educationLoans.size() == 0) {
            System.out.println("you dont have any paid Installment for your educationLoans");
            secondMenu(student);
        } else if (educationLoans.size() == 1) {
            EducationLoan educationLoan = educationLoans.get(0);
            List<PaidInstallments> paidInstallments =
                    paidInstallmentsService.paidInstallmentsEducation(educationLoan.getId());
            if (paidInstallments.size() > 0) {
                for (PaidInstallments paidInstallments1 : paidInstallments) {
                    System.out.println(paidInstallments1.getDate() + " " + paidInstallments1.getAmount());
                }
                secondMenu(student);
            } else {
                System.out.println("no payment yet");
                secondMenu(student);
            }
        } else {
            System.out.println("all of your educationLoans are:");
            for (EducationLoan educationLoan : educationLoans) {
                System.out.println(educationLoans.indexOf(educationLoan) + 1 + " id: " + educationLoan.getId() + " " + educationLoan.getTimeOfTakeLoan());
            }
            System.out.println("please enter your loan id to check");
            Long choose = getLongNumberFromUser();
            List<PaidInstallments> paidInstallments =
                    paidInstallmentsService.paidInstallmentsEducation(choose);
            if (paidInstallments.size() > 0) {
                for (PaidInstallments paidInstallments1 : paidInstallments) {
                    System.out.println(paidInstallments1.getDate() + " " + paidInstallments1.getAmount());
                }
                secondMenu(student);
            } else {
                System.out.println("no payment yet");
                secondMenu(student);
            }
        }
    }

    public void checkPaidInstallmentsTuitionLoans(Student student) {
        List<TuitionLoan> tuitionLoans = tuitionLoanService.tuitionLoans(student.getId());
        if (tuitionLoans.size() == 0) {
            System.out.println("you dont have any paid Installment for your tuitionLoans");
            secondMenu(student);
        } else if (tuitionLoans.size() == 1) {
            TuitionLoan tuitionLoan = tuitionLoans.get(0);
            List<PaidInstallments> paidInstallments =
                    paidInstallmentsService.paidInstallmentsTuition(tuitionLoan.getId());
            if (paidInstallments.size() > 0) {
                for (PaidInstallments paidInstallments1 : paidInstallments) {
                    System.out.println(paidInstallments1.getDate() + " " + paidInstallments1.getAmount());
                }
                secondMenu(student);
            } else {
                System.out.println("no payment yet");
                secondMenu(student);
            }
        } else {
            System.out.println("all of your tuitionLoans are:");
            for (TuitionLoan tuitionLoan : tuitionLoans) {
                System.out.println(tuitionLoans.indexOf(tuitionLoan) + 1 + " id: " + tuitionLoan.getId() + " " + tuitionLoan.getTimeOfTakeLoan());
            }
            System.out.println("please enter your loan id to check");
            Long choose = getLongNumberFromUser();
            List<PaidInstallments> paidInstallments =
                    paidInstallmentsService.paidInstallmentsTuition(choose);
            if (paidInstallments.size() > 0) {
                for (PaidInstallments paidInstallments1 : paidInstallments) {
                    System.out.println(paidInstallments1.getDate() + " " + paidInstallments1.getAmount());
                }
                secondMenu(student);
            } else {
                System.out.println("no payment yet");
                secondMenu(student);
            }
        }
    }

    public void checkPaidInstallmentsMortgage(Student student) {
        Mortgage mortgage = mortgageService.mortgage(student.getId());
        if (mortgage == null) {
            System.out.println("you dont have any paid Installment for your tuitionLoans");
            secondMenu(student);
        } else {
            List<PaidInstallments> paidInstallments =
                    paidInstallmentsService.paidInstallmentsMortgage(mortgage.getId());
            if (paidInstallments.size() > 0) {
                for (PaidInstallments paidInstallments1 : paidInstallments) {
                    System.out.println(paidInstallments1.getDate() + " " + paidInstallments1.getAmount());
                }
                secondMenu(student);
            } else {
                System.out.println("no payment yet");
                secondMenu(student);
            }
        }
    }

    public void payInstallmentEduction(List<UnpaidInstallments> unpaidInstallments, Student student) {
        UnpaidInstallments unpaidInstallment = unpaidInstallments.get(0);
        System.out.println("please enter your bank card number");
        String cardNumber = getStringFromUser();
        if (!cardNumber.equals(student.getCardNumber())) {
            System.out.println("wrong card number !!!");
            secondMenu(student);
        }
        System.out.println("please enter your bank card cvv2");
        String cardCvv2 = getStringFromUser();
        if (!cardCvv2.equals(student.getCvv2())) {
            System.out.println("wrong card cvv2 !!!");
            secondMenu(student);
        }
        System.out.println("please enter your bank card expire date in yyyy-mm");
        String cardExpireDate = getStringFromUser() + "-01";
        if (!cardExpireDate.equals(student.getExpireCardDate().toString())) {
            System.out.println("wrong card expire date !!!");
            secondMenu(student);
        }
        Date nowTime = new Date(System.currentTimeMillis());
        DateTime curJoda = new DateTime(nowTime);
        PaidInstallments paidInstallment = PaidInstallments.builder()
                .date(curJoda.toDate())
                .amount(unpaidInstallment.getAmount())
                .educationLoan(unpaidInstallment.getEducationLoan())
                .build();
        paidInstallmentsService.saveOrUpdate(paidInstallment);
        unpaidInstallmentsService.delete(unpaidInstallment);
    }

    public void payInstallmentTuition(List<UnpaidInstallments> unpaidInstallments, Student student) {
        UnpaidInstallments unpaidInstallment = unpaidInstallments.get(0);
        System.out.println("please enter your bank card number");
        String cardNumber = getStringFromUser();
        if (!cardNumber.equals(student.getCardNumber())) {
            System.out.println("wrong card number !!!");
            secondMenu(student);
        }
        System.out.println("please enter your bank card cvv2");
        String cardCvv2 = getStringFromUser();
        if (!cardCvv2.equals(student.getCvv2())) {
            System.out.println("wrong card cvv2 !!!");
            secondMenu(student);
        }
        System.out.println("please enter your bank card expire date in yyyy-mm");
        String cardExpireDate = getStringFromUser() + "-01";
        if (!cardExpireDate.equals(student.getExpireCardDate().toString())) {
            System.out.println("wrong card expire date !!!");
            secondMenu(student);
        }
        Date nowTime = new Date(System.currentTimeMillis());
        DateTime curJoda = new DateTime(nowTime);
        PaidInstallments paidInstallment = PaidInstallments.builder()
                .date(curJoda.toDate())
                .amount(unpaidInstallment.getAmount())
                .tuitionLoan(unpaidInstallment.getTuitionLoan())
                .build();
        paidInstallmentsService.saveOrUpdate(paidInstallment);
        unpaidInstallmentsService.delete(unpaidInstallment);
    }

    public void payInstallmentMortgage(List<UnpaidInstallments> unpaidInstallments, Student student) {
        UnpaidInstallments unpaidInstallment = unpaidInstallments.get(0);
        System.out.println("please enter your bank card number");
        String cardNumber = getStringFromUser();
        if (!cardNumber.equals(student.getCardNumber())) {
            System.out.println("wrong card number !!!");
            secondMenu(student);
        }
        System.out.println("please enter your bank card cvv2");
        String cardCvv2 = getStringFromUser();
        if (!cardCvv2.equals(student.getCvv2())) {
            System.out.println("wrong card cvv2 !!!");
            secondMenu(student);
        }
        System.out.println("please enter your bank card expire date in yyyy-mm");
        String cardExpireDate = getStringFromUser() + "-01";
        if (!cardExpireDate.equals(student.getExpireCardDate().toString())) {
            System.out.println("wrong card expire date !!!");
            secondMenu(student);
        }
        Date nowTime = new Date(System.currentTimeMillis());
        DateTime curJoda = new DateTime(nowTime);
        PaidInstallments paidInstallment = PaidInstallments.builder()
                .date(curJoda.toDate())
                .amount(unpaidInstallment.getAmount())
                .mortgage(unpaidInstallment.getMortgage())
                .build();
        paidInstallmentsService.saveOrUpdate(paidInstallment);
        unpaidInstallmentsService.delete(unpaidInstallment);
    }

    public void requestEducationLoan(Student student) {
        Long id = student.getId();
        Grades grade = student.getGrade();
        Style style = student.getStyle();

        List<EducationLoan> educationLoans = educationLoanService.educationLoans(id);
        if (educationLoans.size() > 0) {
            Date maxDate = educationLoans.stream().map(EducationLoan::getTimeOfTakeLoan).max(Date::compareTo).stream().findFirst().orElse(null);
            Date current = new Date(System.currentTimeMillis());
            DateTime maxJoda = new DateTime(maxDate);
            DateTime curJoda = new DateTime(current);
            if (maxJoda.getYear() == curJoda.getYear() && maxJoda.getMonthOfYear() == curJoda.getMonthOfYear()) {
                System.out.println("you already requested for this loan in this term");
                secondMenu(student);
            } else {
                EducationLoan educationLoan = EducationLoan.builder()
                        .typeOfLoan(typeOfEducationLoan(grade, style))
                        .timeOfTakeLoan(current)
                        .student(student)
                        .build();
                if (educationLoanService.validate(educationLoan)) {
                    System.out.println("and cvv2: " + student.getCvv2());
                    educationLoanService.saveOrUpdate(educationLoan);
                    System.out.println("your request has been accepted");
                    System.out.println("amount of this loan is: " + amountOfEducationLoan(educationLoan));
                    System.out.println("it will be deposit to your bank card by number below");
                    showBankCard(student);
                    setInstallmentsForEducationLoans(educationLoan);
                    secondMenu(student);
                }
            }
        } else {
            EducationLoan educationLoan = EducationLoan.builder()
                    .typeOfLoan(typeOfEducationLoan(grade, style))
                    .timeOfTakeLoan(new Date(System.currentTimeMillis()))
                    .student(student)
                    .build();
            if (educationLoanService.validate(educationLoan)) {
                educationLoanService.saveOrUpdate(educationLoan);
                setInstallmentsForEducationLoans(educationLoan);
                System.out.println("your request has been accepted");
                System.out.println("amount of this loan is: " + amountOfEducationLoan(educationLoan));
                System.out.println("it will be deposit to your bank card by number below");
                showBankCard(student);
                System.out.println("and cvv2: " + student.getCvv2());
                secondMenu(student);
            }
        }
    }

    public int typeOfEducationLoan(Grades grade, Style style) {
        int type;
        if (grade == Grades.ASSOCIATEDEGREE || grade == Grades.BACHELORSDEGREE) {
            type = 1;
            return type;
        } else if (grade == Grades.MASTERSDEGREE) {
            type = 2;
            return type;
        } else if (grade == Grades.DOCTORATE && style == Style.CONTINUOUS) {
            type = 2;
            return type;
        } else {
            type = 3;
            return type;
        }
    }

    public int typeOfMortgage(Student student) {
        int type;
        List<String> largeCities = new ArrayList<>();
        largeCities.add("rasht");
        largeCities.add("ardebil");
        largeCities.add("shiraz");
        largeCities.add("ahvaz");
        largeCities.add("qom");
        largeCities.add("mashhad");
        largeCities.add("karaj");

        if (student.getCity().equals("tehran")) {
            type = 1;
            return type;
        } else if (largeCities.contains(student.getCity())) {
            type = 2;
            return type;
        } else {
            type = 3;
            return type;
        }
    }

    public int amountOfEducationLoan(EducationLoan educationLoan) {
        int amount;
        if (educationLoan.getTypeOfLoan() == 1) {
            amount = 1900000;
        } else if (educationLoan.getTypeOfLoan() == 2) {
            amount = 2250000;
        } else {
            amount = 2600000;
        }
        return amount;
    }

    public int amountOfTMortgage(Mortgage mortgage) {
        int amount;
        if (mortgage.getTypeOfLoan() == 1) {
            amount = 32000000;
        } else if (mortgage.getTypeOfLoan() == 2) {
            amount = 26000000;
        } else {
            amount = 19500000;
        }
        return amount;
    }

    public int amountOfTuitionLoan(TuitionLoan tuitionLoan) {
        int amount;
        if (tuitionLoan.getTypeOfLoan() == 1) {
            amount = 1300000;
        } else if (tuitionLoan.getTypeOfLoan() == 2) {
            amount = 2600000;
        } else {
            amount = 65000000;
        }
        return amount;
    }

    public void setInstallmentsForEducationLoans(EducationLoan educationLoan) {
        int type = educationLoan.getTypeOfLoan();
        long amount;

        Date date = educationLoan.getTimeOfTakeLoan();
        DateTime dateChanged = new DateTime(date);


        if (type == 1) {
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 5915;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 11831;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 23662;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 47324;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 94648;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
        } else if (type == 2) {
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 7005;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 14010;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 28021;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 56041;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 112083;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
        } else {
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 8095;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 16190;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 32380;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 64759;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 129518;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .educationLoan(educationLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
        }
    }

    public void requestTuitionLoan(Student student) {
        Long id = student.getId();
        Grades grade = student.getGrade();
        Style style = student.getStyle();

        if (student.getUniversityTypes() == UniversityTypes.GOVERNMENTAL
                && student.getDayOrNight() == DayOrNight.DAY) {
            System.out.println("This loan will not be awarded to you");
            secondMenu(student);
        } else {

            List<TuitionLoan> tuitionLoans = tuitionLoanService.tuitionLoans(id);
            if (tuitionLoans.size() > 0) {
                Date maxDate = tuitionLoans.stream().map(TuitionLoan::getTimeOfTakeLoan).max(Date::compareTo).stream().findFirst().orElse(null);
                Date current = new Date(System.currentTimeMillis());
                DateTime maxJoda = new DateTime(maxDate);
                DateTime curJoda = new DateTime(current);
                if (maxJoda.getYear() == curJoda.getYear() && maxJoda.getMonthOfYear() == curJoda.getMonthOfYear()) {
                    System.out.println("you already requested for this loan in this term");
                    secondMenu(student);
                } else {
                    TuitionLoan tuitionLoan = TuitionLoan.builder()
                            .typeOfLoan(typeOfEducationLoan(grade, style))
                            .timeOfTakeLoan(current)
                            .student(student)
                            .build();
                    if (tuitionLoanService.validate(tuitionLoan)) {
                        tuitionLoanService.saveOrUpdate(tuitionLoan);
                        setInstallmentsForTuitionLoans(tuitionLoan);
                        System.out.println("your request has been accepted");
                        System.out.println("amount of this loan is: " + amountOfTuitionLoan(tuitionLoan));
                        System.out.println("it will be deposit to your bank card by number below");
                        showBankCard(student);
                        System.out.println("and cvv2: " + student.getCvv2());
                        secondMenu(student);
                    }
                }
            } else {
                TuitionLoan tuitionLoan = TuitionLoan.builder()
                        .typeOfLoan(typeOfEducationLoan(grade, style))
                        .timeOfTakeLoan(new Date(System.currentTimeMillis()))
                        .student(student)
                        .build();
                if (tuitionLoanService.validate(tuitionLoan)) {
                    tuitionLoanService.saveOrUpdate(tuitionLoan);
                    setInstallmentsForTuitionLoans(tuitionLoan);
                    System.out.println("your request has been accepted");
                    System.out.println("amount of this loan is: " + amountOfTuitionLoan(tuitionLoan));
                    System.out.println("it will be deposit to your bank card by number below");
                    showBankCard(student);
                    System.out.println("and cvv2: " + student.getCvv2());
                    secondMenu(student);
                }
            }
        }
    }

    public void requestMortgage(Student student) {
        Long id = student.getId();

        if (student.getMaritalStatus() == MaritalStatus.SINGLE) {
            System.out.println("This loan will not be awarded to you");
            secondMenu(student);
        } else {
            WifeOrHusband wifeOrHusband = wifeOrHusbandService.findByStudentId(student.getId());
            Student wifeOrHusbandStudent = studentService.findByNationalCode(wifeOrHusband.getNationalCode());
            if (wifeOrHusbandStudent != null) {
                Mortgage mortgage = mortgageService.mortgage(wifeOrHusbandStudent.getId());
                if (mortgage != null) {
                    System.out.println("your wife or husband already requested for this loan");
                    secondMenu(student);
                }
            }
            Mortgage mortgage = mortgageService.mortgage(id);
            if (mortgage != null) {
                System.out.println("you already requested for this loan in this grade");
                secondMenu(student);
            } else {

                Mortgage mortgage1 = Mortgage.builder()
                        .contractNumber(getContractNumber())
                        .timeOfTakeLoan(new Date(System.currentTimeMillis()))
                        .typeOfLoan(typeOfMortgage(student))
                        .student(student)
                        .build();
                if (mortgageService.validate(mortgage1)) {
                    mortgageService.saveOrUpdate(mortgage1);
                    setInstallmentsForMortgage(mortgage1);
                    System.out.println("your request has been accepted");
                    System.out.println("amount of this loan is: " + amountOfTMortgage(mortgage1));
                    System.out.println("it will be deposit to your bank card by number below");
                    showBankCard(student);
                    System.out.println(" and cvv2: " + student.getCvv2());
                    secondMenu(student);
                }
            }
        }
    }

    public void setInstallmentsForTuitionLoans(TuitionLoan tuitionLoan) {
        int type = tuitionLoan.getTypeOfLoan();
        long amount;

        Date date = tuitionLoan.getTimeOfTakeLoan();
        DateTime dateChanged = new DateTime(date);


        if (type == 1) {
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 4047;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 8095;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 16190;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 32380;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 64759;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
        } else if (type == 2) {
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 8095;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 16190;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 32380;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 64759;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 129518;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
        } else {
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 202372;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 404744;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 809488;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 1618975;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 3237950;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .tuitionLoan(tuitionLoan)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
        }
    }

    public void setInstallmentsForMortgage(Mortgage mortgage) {
        int type = mortgage.getTypeOfLoan();
        long amount;

        Date date = mortgage.getTimeOfTakeLoan();
        DateTime dateChanged = new DateTime(date);


        if (type == 1) {
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 99629;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 199258;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 398517;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 797034;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 1594068;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
        } else if (type == 2) {
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 80949;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 161898;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 323795;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 647590;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 1295180;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
        } else {
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 60712;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 121423;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 242846;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 485693;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
            for (int i = 1; i < 12; i++) {
                Date dateInstallments = dateChanged.plusMonths(1).toDate();
                dateChanged = dateChanged.plusMonths(1);
                amount = 971385;
                UnpaidInstallments unpaidInstallment = UnpaidInstallments.builder()
                        .amount(amount)
                        .date(dateInstallments)
                        .mortgage(mortgage)
                        .build();
                if (unpaidInstallmentsService.validate(unpaidInstallment)) {
                    unpaidInstallmentsService.saveOrUpdate(unpaidInstallment);
                }
            }
        }
    }
}
