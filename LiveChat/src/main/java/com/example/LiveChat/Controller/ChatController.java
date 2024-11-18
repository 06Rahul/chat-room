//package com.example.LiveChat.Controller;
//
//import com.example.LiveChat.Model.ChatMessage;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@Controller
//public class ChatController {
//
//    @MessageMapping("/sendMessage")
//    @SendTo("/topic/messages")
//    public ChatMessage sendmessage(ChatMessage message){
//       return  message;
//    }
//
//    @GetMapping("chat")
//    public String chat(){
//        return "chat";
//    }
//
//}
package com.example.LiveChat.Controller;

import com.example.LiveChat.Model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message; // Broadcast the message
    }

    @GetMapping("/chat")
    public String chat() {
        return "chat"; // Returns the chat.html page
    }
}


