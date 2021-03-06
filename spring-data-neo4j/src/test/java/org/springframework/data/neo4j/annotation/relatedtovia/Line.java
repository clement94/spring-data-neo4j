/**
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.neo4j.annotation.relatedtovia;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

@RelationshipEntity(type = "route")
public class Line
{
    @GraphId
    private Long id;

    @StartNode
    private TubeStation origin;

    @EndNode
    private TubeStation destination;

    private String name;

    public Line()
    {

    }

    public Line( TubeStation origin, TubeStation destination, String name )
    {
        this.origin = origin;
        this.destination = destination;
        this.name = name;
    }

    public TubeStation getOrigin()
    {
        return origin;
    }

    public TubeStation getDestination()
    {
        return destination;
    }

    public String getName()
    {
        return name;
    }
}
