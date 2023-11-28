package com.example.sbbtest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        List<Question> questionList = questionRepository.findAll();
        return questionList;
    }

    public void create(String subject, String content) {
        Question q = new Question();
        q.setSubject(subject);
        q.setContent(content);
        q.setLocalDateTime(LocalDateTime.now());

        this.questionRepository.save(q);
    }

    public Question findById(Integer id) {
        Optional<Question> oq = this.questionRepository.findById(id);
        return oq.get();
    }
}
