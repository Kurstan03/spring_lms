package org.example.model;

import lombok.*;

import java.util.List;

/**
 * @author kurstan
 * @created at 08.02.2023 0:53
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WhatsApp implements Messenger{
    private String login;
    private String status;
    private List<String> contacts;
}
