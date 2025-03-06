package br.com.cleanarchitecture.crud.domain.vo;

import lombok.Getter;

import java.util.regex.Pattern;

@Getter
public class Email {

    private String document;
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public Email(String document) {
        if (document == null || !pattern.matcher(document).matches()) {
            throw new IllegalArgumentException("Email no padrão incorreto!");
        }
        this.document = document;
    }

    @Override
    public String toString() {
        return this.document;
    }
}
