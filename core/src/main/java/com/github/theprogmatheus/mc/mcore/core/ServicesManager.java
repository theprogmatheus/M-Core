package com.github.theprogmatheus.mc.mcore.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ServicesManager {

    private final Map<Class<?>, Object> services = new HashMap<>();

    /**
     * Registra um novo serviço.
     *
     * @param serviceClass - A classe chave do serviço que deve ser registrado.
     * @param service      - O serviço que deve ser registrado.
     * @param <S>          - Tipo do serviço que deve ser registrado.
     * @return true se o serviço foi registrado com sucesso.
     */
    public <S> boolean register(Class<S> serviceClass, S service) {
        if (serviceClass != null && service != null && serviceClass.isAssignableFrom(service.getClass())) {
            this.services.put(serviceClass, service);
            return true;
        }
        return false;
    }

    /**
     * Remove um serviço registrado.
     *
     * @param serviceClass - A classe chave do serviço registrado.
     * @return true se o serviço foi removido com sucesso.
     */
    public boolean unregister(Class<?> serviceClass) {
        return this.services.remove(serviceClass) != null;
    }

    /**
     * Resgata um serviço registrado anteriormente
     *
     * @param serviceClass - A classe chave do serviço registrado.
     * @param <S>          - Tipó do serviço a ser resgatado.
     * @return O serviço registrado ou null caso não for encontrado um serviço pela classe chave informada.
     */
    public <S> S getService(Class<S> serviceClass) {
        Object service = this.services.get(serviceClass);
        if (service != null && serviceClass.isAssignableFrom(service.getClass()))
            return serviceClass.cast(service);

        return null;
    }

    /**
     * Verifica se já existe um serviço registrado na classe chave.
     *
     * @param serviceClass - Classe chave do serviço que deve ser verificado.
     * @return true se já existe um serviço registrado com essa chave.
     */
    public boolean hasService(Class<?> serviceClass) {
        return services.containsKey(serviceClass);
    }

    /**
     * Lista todos os serviços registrados.
     *
     * @return Um set dos serviços registrados.
     */
    public Set<Class<?>> listServices() {
        return Collections.unmodifiableSet(services.keySet());
    }

}
