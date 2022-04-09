package com.system.blog.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

/**
*
*   @author Enrique Navarro (Lordkikes)
*   @version 1.0
*   @since 09/04/2022
 */

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "publications", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})})
public class Publications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "content", nullable = false)
    private String content;

}
