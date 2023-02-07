package org.example.model;

import lombok.*;

/**
 * @author kurstan
 * @created at 08.02.2023 0:52
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MobilePhone {
    private String brand;
    private Long memory;
    private Messenger messenger;
}
