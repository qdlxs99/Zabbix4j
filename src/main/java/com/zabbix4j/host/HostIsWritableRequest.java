package com.zabbix4j.host;

import com.zabbix4j.ZabbixApiRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Request paramter for host.iswritable
 *
 * @author suguru yajima 2014
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HostIsWritableRequest extends ZabbixApiRequest {
    private List<Integer> params = new ArrayList<Integer>();

    public HostIsWritableRequest() {
        setMethod("host.iswritable");
    }

    public void addHostId(Integer id) {
        params.add(id);
    }
}
