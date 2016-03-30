package com.deswaef.netflixexamples.api.notifications.client;

import com.deswaef.netflixexamples.api.notifications.model.Notification;
import com.netflix.hystrix.Hystrix;
import com.netflix.hystrix.HystrixObservable;

import java.util.ArrayList;
import java.util.List;

public class NotificationResourceImpl implements NotificationResource {

    @Override
    public List<Notification> findAll() {
        return new ArrayList<>();
    }
}
