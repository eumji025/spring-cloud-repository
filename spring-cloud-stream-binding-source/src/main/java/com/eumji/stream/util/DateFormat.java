package com.eumji.stream.util;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.text.SimpleDateFormat;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

/**
 * The annotated String must be a valid {@link java.text.SimpleDateFormat} pattern.
 *
 * @author Eric Bottard
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {DateFormat.DateFormatValidator.class})
public @interface DateFormat {

    String DEFAULT_MESSAGE = "";

    String message() default DEFAULT_MESSAGE;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


    /**
     * Defines several {@link DateFormat} annotations on the same element.
     *
     * @see DateFormat
     */
    @Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
    @Retention(RUNTIME)
    @Documented
    @interface List {

        DateFormat[] value();
    }

    public static class DateFormatValidator implements ConstraintValidator<DateFormat, CharSequence> {

        private String message;

        @Override
        public void initialize(DateFormat constraintAnnotation) {
            this.message = constraintAnnotation.message();
        }

        @Override
        public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
            if (value == null) {
                return true;
            }
            try {
                new SimpleDateFormat(value.toString());
            }
            catch (IllegalArgumentException e) {
                if (DEFAULT_MESSAGE.equals(this.message)) {
                    context.disableDefaultConstraintViolation();
                    context.buildConstraintViolationWithTemplate(e.getMessage()).addConstraintViolation();
                }
                return false;
            }
            return true;
        }
    }

}
