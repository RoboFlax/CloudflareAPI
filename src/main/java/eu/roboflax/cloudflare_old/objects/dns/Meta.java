/*
 * Copyright (c) RoboFlax. All rights reserved.
 * Use is subject to license terms.
 */
package eu.roboflax.cloudflare_old.objects.dns;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Meta {
    
    @SerializedName("auto_added")
    @Expose
    private Boolean autoAdded;
    @SerializedName("managed_by_apps")
    @Expose
    private Boolean managedByApps;
    
    @Override
    public String toString( ) {
        return new ToStringBuilder( this )
                .append( "autoAdded", autoAdded )
                .append( "managedByApps", managedByApps ).toString();
    }
    
}