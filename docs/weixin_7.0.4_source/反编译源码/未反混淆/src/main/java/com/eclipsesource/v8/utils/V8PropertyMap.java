package com.eclipsesource.v8.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class V8PropertyMap<V> implements Map<String, V> {
    private Hashtable<String, V> map = new Hashtable();
    private Set<String> nulls = new HashSet();

    V8PropertyMap() {
        AppMethodBeat.i(75145);
        AppMethodBeat.o(75145);
    }

    public int size() {
        AppMethodBeat.i(75146);
        int size = this.map.size() + this.nulls.size();
        AppMethodBeat.o(75146);
        return size;
    }

    public boolean isEmpty() {
        AppMethodBeat.i(75147);
        if (this.map.isEmpty() && this.nulls.isEmpty()) {
            AppMethodBeat.o(75147);
            return true;
        }
        AppMethodBeat.o(75147);
        return false;
    }

    public boolean containsKey(Object obj) {
        AppMethodBeat.i(75148);
        if (this.map.containsKey(obj) || this.nulls.contains(obj)) {
            AppMethodBeat.o(75148);
            return true;
        }
        AppMethodBeat.o(75148);
        return false;
    }

    public boolean containsValue(Object obj) {
        AppMethodBeat.i(75149);
        if (obj == null && !this.nulls.isEmpty()) {
            AppMethodBeat.o(75149);
            return true;
        } else if (obj == null) {
            AppMethodBeat.o(75149);
            return false;
        } else {
            boolean containsValue = this.map.containsValue(obj);
            AppMethodBeat.o(75149);
            return containsValue;
        }
    }

    public V get(Object obj) {
        AppMethodBeat.i(75150);
        if (this.nulls.contains(obj)) {
            AppMethodBeat.o(75150);
            return null;
        }
        V v = this.map.get(obj);
        AppMethodBeat.o(75150);
        return v;
    }

    public V put(String str, V v) {
        AppMethodBeat.i(75151);
        if (v == null) {
            if (this.map.containsKey(str)) {
                this.map.remove(str);
            }
            this.nulls.add(str);
            AppMethodBeat.o(75151);
            return null;
        }
        if (this.nulls.contains(str)) {
            this.nulls.remove(str);
        }
        V put = this.map.put(str, v);
        AppMethodBeat.o(75151);
        return put;
    }

    public V remove(Object obj) {
        AppMethodBeat.i(75152);
        if (this.nulls.contains(obj)) {
            this.nulls.remove(obj);
            AppMethodBeat.o(75152);
            return null;
        }
        V remove = this.map.remove(obj);
        AppMethodBeat.o(75152);
        return remove;
    }

    public void putAll(Map<? extends String, ? extends V> map) {
        AppMethodBeat.i(75153);
        for (Entry entry : map.entrySet()) {
            put((String) entry.getKey(), entry.getValue());
        }
        AppMethodBeat.o(75153);
    }

    public void clear() {
        AppMethodBeat.i(75154);
        this.map.clear();
        this.nulls.clear();
        AppMethodBeat.o(75154);
    }

    public Set<String> keySet() {
        AppMethodBeat.i(75155);
        HashSet hashSet = new HashSet(this.map.keySet());
        hashSet.addAll(this.nulls);
        AppMethodBeat.o(75155);
        return hashSet;
    }

    public Collection<V> values() {
        AppMethodBeat.i(75156);
        ArrayList arrayList = new ArrayList(this.map.values());
        for (int i = 0; i < this.nulls.size(); i++) {
            arrayList.add(null);
        }
        AppMethodBeat.o(75156);
        return arrayList;
    }

    public Set<Entry<String, V>> entrySet() {
        AppMethodBeat.i(75157);
        HashSet hashSet = new HashSet(this.map.entrySet());
        for (String simpleEntry : this.nulls) {
            hashSet.add(new SimpleEntry(simpleEntry, null));
        }
        AppMethodBeat.o(75157);
        return hashSet;
    }
}
