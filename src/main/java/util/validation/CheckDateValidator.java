package util.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckDateValidator implements ConstraintValidator<CheckDateFormat, String> {

    private String pattern;

    @Override
    public void initialize(CheckDateFormat constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String object, ConstraintValidatorContext constraintValidatorContext) {
        if (object == null) {
            return true;
        }

        try {
            Date date = new SimpleDateFormat(pattern).parse(object);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

