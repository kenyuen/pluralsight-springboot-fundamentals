package com.pluralsight.fundamentals.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pluralsight.fundamentals.entity.Review;
import com.pluralsight.fundamentals.repository.ReviewRepository;
import org.springframework.stereotype.Component;

@Component
public class ReviewQueryResolver implements GraphQLQueryResolver {
    private ReviewRepository reviewRepository;

    public ReviewQueryResolver(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Iterable<Review> reviews() {
        return reviewRepository.findAll();
    }

}

/*
public class ApplicationQueryResolver implements GraphQLQueryResolver {
    private ApplicationRepository applicationRepository;

    public ApplicationQueryResolver(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Iterable<Application> findAllApplications() {
        return applicationRepository.findAll();
    }

    public long countApplications() {
        return applicationRepository.count();
    }
}


---
public class SnackQueryResolver(val snackRepository: SnackRepository,
                         private val mongoOperations: MongoOperations) : GraphQLQueryResolver {
    fun snacks(): List<Snack> {
        val list = snackRepository.findAll()
        for (item in list) {
            item.reviews = getReviews(snackId = item.id)
        }
        return list
    }

    private fun getReviews(snackId: String): List<Review> {
        val query = Query()
        query.addCriteria(Criteria.where("snackId").`is`(snackId))
        return mongoOperations.find(query, Review::class.java)
    }
}
 */