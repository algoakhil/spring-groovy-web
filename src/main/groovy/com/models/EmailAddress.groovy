package com.models

import org.springframework.util.Assert

import javax.persistence.Column
import javax.persistence.Embeddable
import java.util.regex.Pattern

/**
 * User: Akhil Shastri
 * Date: 11/14/13
 * Time: 12:12 PM
 */
@Embeddable
class EmailAddress {
    private static final String EMAIL_REGEX = '^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$';
    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

    @Column(name = "email")
    private String value;

    /**
     * Creates a new {@link EmailAddress} from the given string source.
     *
     * @param emailAddress must not be {@literal null} or empty.
     */
    public EmailAddress(String emailAddress) {
        Assert.isTrue(isValid(emailAddress), "Invalid email address!");
        this.value = emailAddress;
    }

    protected EmailAddress() {

    }

    /**
     * Returns whether the given {@link String} is a valid {@link EmailAddress} which means you can safely instantiate the
     * class.
     *
     * @param candidate
     * @return
     */
    public static boolean isValid(String candidate) {
        return candidate == null ? false : PATTERN.matcher(candidate).matches();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return value;
    }
}
