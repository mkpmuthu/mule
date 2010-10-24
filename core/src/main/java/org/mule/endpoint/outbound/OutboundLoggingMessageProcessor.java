/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.endpoint.outbound;

import org.mule.api.MuleEvent;
import org.mule.processor.AbstractMessageObserver;

public class OutboundLoggingMessageProcessor extends AbstractMessageObserver
{

    @Override
    public void observe(MuleEvent event)
    {
        if (logger.isDebugEnabled())
        {
            logger.debug("sending event: " + event);
        }
    }

}