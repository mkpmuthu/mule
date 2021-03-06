/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.launcher.application;

import java.io.IOException;

/**
 * Creates {@link Application} instances
 */
public interface ApplicationFactory
{

    /**
     * Creates an application
     *
     * @param appName the name of the application to create
     * @return the application instance that corresponds to the given name
     * @throws IOException
     */
    //TODO(pablo.kraan): createApp should throw an Exception class more related
    //to the domain instead of a low level IOException
    public Application createApp(String appName) throws IOException;
}
