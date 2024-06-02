package com.techacademy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InputController {

    private static final String INPUT_MESSAGE = "値を入力してください";

    @GetMapping("/input")
    public String getInput(Model model) {
        model.addAttribute("message", INPUT_MESSAGE);
        return "input";
    }
}
