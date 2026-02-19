package com.stiwarback.stiwarback.controller;



import org.springframework.web.bind.annotation.RestController;

import com.stiwarback.stiwarback.entity.;
import com.stiwarback.stiwarback.service.ResiduoService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/v1/articles")
public class ResiduoController  {

    private final ResiduoService residuoService;

    public ResiduoController(ResiduoService residuoService){ 
        this.residuoServiceService = reisduoService;
    }
    @PostMapping("/{userId}")
    public ResponseEntity<Residuo> createResiduo(@RequestBody Article article,@PathVariable int userId) {
        Residuo newResiduo= articleService.createArticle(article, userId);
        return new ResponseEntity<>(newArticle, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Article>> getAllArticles() {
        List<Article> articles = articleService.getAllArticles();
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteArticle(@PathVariable int id){
        articleService.deleteArticle(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Article> updateArticle(@PathVariable int id, @RequestBody Article article) {
    Article updatedArticle = articleService.updateArticle(id, article);
    return new ResponseEntity<>(updatedArticle, HttpStatus.OK);
}

}

