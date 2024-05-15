package util.applicationcontext;

import connection.SessionFactorySingleton;
import org.hibernate.SessionFactory;
import repository.educationLoan.EducationLoanRepository;
import repository.educationLoan.EducationLoanRepositoryImpl;
import repository.mortgage.MortgageRepository;
import repository.mortgage.MortgageRepositoryImpl;
import repository.paidInstallments.PaidInstallmentsRepository;
import repository.paidInstallments.PaidInstallmentsRepositoryImpl;
import repository.student.StudentRepository;
import repository.student.StudentRepositoryImpl;
import repository.tuitionLoan.TuitionLoanRepository;
import repository.tuitionLoan.TuitionLoanRepositoryImpl;
import repository.unpaidInstallments.UnpaidInstallmentsRepository;
import repository.unpaidInstallments.UnpaidInstallmentsRepositoryImpl;
import repository.wifeOrHusband.WifeOrHusbandRepository;
import repository.wifeOrHusband.WifeOrHusbandRepositoryImpl;
import service.educationLoan.EducationLoanService;
import service.educationLoan.EducationLoanServiceImpl;
import service.mortgage.MortgageService;
import service.mortgage.MortgageServiceImpl;
import service.paidInstallments.PaidInstallmentsService;
import service.paidInstallments.PaidInstallmentsServiceImpl;
import service.student.StudentService;
import service.student.StudentServiceImpl;
import service.tuitionLoan.TuitionLoanService;
import service.tuitionLoan.TuitionLoanServiceImpl;
import service.unpaidInstallments.UnpaidInstallmentsService;
import service.unpaidInstallments.UnpaidInstallmentsServiceImpl;
import service.wifeOrHusband.WifeOrHusbandService;
import service.wifeOrHusband.WifeOrHusbandServiceImpl;

public class ApplicationContext {
    static final SessionFactory SESSION_FACTORY;

    private static final StudentRepository STUDENT_REPOSITORY;
    private static final StudentService STUDENT_SERVICE;

    private static final EducationLoanRepository EDUCATION_LOAN_REPOSITORY;
    private static final EducationLoanService EDUCATION_LOAN_SERVICE;

    private static final MortgageRepository MORTGAGE_REPOSITORY;
    private static final MortgageService MORTGAGE_SERVICE;

    private static final PaidInstallmentsRepository PAID_INSTALLMENTS_REPOSITORY;
    private static final PaidInstallmentsService PAID_INSTALLMENTS_SERVICE;

    private static final TuitionLoanRepository TUITION_LOAN_REPOSITORY;
    private static final TuitionLoanService TUITION_LOAN_SERVICE;

    private static final UnpaidInstallmentsRepository UNPAID_INSTALLMENTS_REPOSITORY;
    private static final UnpaidInstallmentsService UNPAID_INSTALLMENTS_SERVICE;

    private static final WifeOrHusbandRepository WIFE_OR_HUSBAND_REPOSITORY;
    private static final WifeOrHusbandService WIFE_OR_HUSBAND_SERVICE;

    static {
        SESSION_FACTORY = SessionFactorySingleton.getInstance();

        STUDENT_REPOSITORY = new StudentRepositoryImpl(SESSION_FACTORY);
        EDUCATION_LOAN_REPOSITORY = new EducationLoanRepositoryImpl(SESSION_FACTORY);
        MORTGAGE_REPOSITORY = new MortgageRepositoryImpl(SESSION_FACTORY);
        PAID_INSTALLMENTS_REPOSITORY = new PaidInstallmentsRepositoryImpl(SESSION_FACTORY);
        TUITION_LOAN_REPOSITORY = new TuitionLoanRepositoryImpl(SESSION_FACTORY);
        UNPAID_INSTALLMENTS_REPOSITORY = new UnpaidInstallmentsRepositoryImpl(SESSION_FACTORY);
        WIFE_OR_HUSBAND_REPOSITORY = new WifeOrHusbandRepositoryImpl(SESSION_FACTORY);

        STUDENT_SERVICE = new StudentServiceImpl(STUDENT_REPOSITORY, SESSION_FACTORY);
        EDUCATION_LOAN_SERVICE = new EducationLoanServiceImpl(EDUCATION_LOAN_REPOSITORY, SESSION_FACTORY);
        MORTGAGE_SERVICE = new MortgageServiceImpl(MORTGAGE_REPOSITORY, SESSION_FACTORY);
        PAID_INSTALLMENTS_SERVICE = new PaidInstallmentsServiceImpl(PAID_INSTALLMENTS_REPOSITORY, SESSION_FACTORY);
        TUITION_LOAN_SERVICE = new TuitionLoanServiceImpl(TUITION_LOAN_REPOSITORY,SESSION_FACTORY);
        UNPAID_INSTALLMENTS_SERVICE = new UnpaidInstallmentsServiceImpl(UNPAID_INSTALLMENTS_REPOSITORY,SESSION_FACTORY);
        WIFE_OR_HUSBAND_SERVICE = new WifeOrHusbandServiceImpl(WIFE_OR_HUSBAND_REPOSITORY,SESSION_FACTORY);
    }

    public static StudentService getStudentService() {
        return STUDENT_SERVICE;
    }

    public static EducationLoanService getEducationLoanService() {
        return EDUCATION_LOAN_SERVICE;
    }

    public static MortgageService getMortgageService() {
        return MORTGAGE_SERVICE;
    }
    public static PaidInstallmentsService getPaidInstallmentsService(){return PAID_INSTALLMENTS_SERVICE;}
    public static TuitionLoanService getTuitionLoanService(){return TUITION_LOAN_SERVICE;}
    public static UnpaidInstallmentsService getUnpaidInstallmentsService(){return UNPAID_INSTALLMENTS_SERVICE;}
    public static WifeOrHusbandService getWifeOrHusbandService(){return WIFE_OR_HUSBAND_SERVICE;}

}
