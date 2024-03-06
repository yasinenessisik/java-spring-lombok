package com.yasinenessisik.javaspringlombok;

import lombok.*;

@Getter
@Setter
@ToString(of = "id")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor,
public class Person {
    /*@Getter
    @Setter*/
    @Setter(AccessLevel.PRIVATE)
    private Long id;
    private String name;
    private String surname;
}
